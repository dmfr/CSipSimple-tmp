
external_repos := zrtp4pj openssl
external_sources := $(foreach repos, $(external_repos),jni/$(repos)/sources)

to_patch := pjsip
to_patch_files := $(foreach proj, $(to_patch),jni/$(proj)/.patched_sources)

STUDIO_LIBS := app/src/main/jniLibs/

all : libraries
	# Build native library SUCCESSFUL => to jniLibs @androidStudio
	@(mkdir -p $(STUDIO_LIBS))
	@(cp -r -f libs/* $(STUDIO_LIBS))

libraries : ext-sources
	# Build main libraries using android ndk
	@(ndk-build -j$(shell nproc))

ffmpeg-lib : jni/ffmpeg/.patched_sources
	# Build ffmpeg using make
	@($(MAKE) $(MFLAGS) -C jni/ffmpeg)
	
webrtc-preprocess :
	@($(MAKE) $(MFLAGS) -C jni/webrtc preprocess)
	
libvpx-preprocess :
	@($(MAKE) $(MFLAGS) -C jni/libvpx preprocess)

ext-sources : $(external_sources) $(to_patch_files)
	# External sources fetched out from external repos/zip
	
jni/%/sources :
	@($(MAKE) $(MFLAGS) -C $(subst /sources,,$@) init)
	
## Patches against remote projects
jni/%/.patched_sources : 
	@($(MAKE) $(MFLAGS) -C $(subst /.patched_sources,,$@) patch)


clean :
	# NDK clean
	@(ndk-build clean)
	# Remote clean
	@($(MAKE) -C jni/ffmpeg clean)
	@($(MAKE) -C jni/webrtc clean)


update : $(external_sources)
	# Quilt removal
	@$(foreach dir,$(to_patch),$(MAKE) $(MFLAGS) -C jni/$(dir) unpatch;)
	# Svn update
	@svn update --accept theirs-conflict
	# Remote sources update
	@$(foreach dir,$(external_repos),$(MAKE) $(MFLAGS) -C jni/$(dir) update;)
	# Update ffmpeg
	@($(MAKE) $(MFLAGS) -C jni/ffmpeg update)
	
