# CSipSimple-tmp
Fork & (dirty) fixes for CSipSimple, to make it work with 2021 tools & current API level.

Still work to do. If anyone reading this, **please read to the end**

## Notes, NDK / JNI
- Compiles ( arm64-v8a + x86_64 ) with NDK r23b
- Video support (webrtc, libvpx) disabled (for now?), some external codecs (opus, silk) disabled as well.
- OpenSL-ES backend is hardcoded<br>
Somehow sideload of separate libpj_opensl_dev by pjsip lib doesn't work<br>
As result android_jni_dev audio backend cannot be used
- For hardware AEC, my dirty hack from 2014 still applies.<br>
See : https://code.google.com/archive/p/csipsimple/issues/2838<br>
So it is not guaranteed to work on all devices, however on Nexus/Pixel for many years it has been very stable.

## Notes, Android java part
- API level 30
- Sherlock / supportv4 replaced by std android API. No use of androidx or support library.<br>
So minimum API level = 26
- Favorites fragment disabled (too complicated to migrate)
- Incallcontrols disabled, no DTMF, speaker, in-call settings for now. Might fix it eventually.

## To build
- NDK_DIR to path, standard tools (make, quilt,...)
- SWIG 2.0 needed, hard to find RPM, compile 2.0.12 from source.
- First build native part : `make`
- Then build app APK using Android studio.

## Bugs / Things to know
- As openSL + hardware AEC is hardcoded, no need for software echo cancel. By default : no echo cancel + sound clock to 48khz.<br>Near-zero audio latency.
- **Android permissions have to be applied manually after install !**<br>SIP will fail if permissions not granted one by one<br>Access Settings > app > ...
- SIP service does not (always) resume when Wifi connectivity is back after a long out-of-wifi time

## Todo ?
- use androidx / current support libraries
- implement android compliant permission requests
- use `ConnectivityManager.NetworkCallback` for connectivity queries
- Migrate InCall controls to std android API.
