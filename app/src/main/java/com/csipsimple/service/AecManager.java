package com.csipsimple.service;

import java.util.ArrayList;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.media.audiofx.AcousticEchoCanceler;
import android.util.Log;

public class AecManager {
	AcousticEchoCanceler mAec ;
	int mStartId ;
	
	public AecManager( int sampleRate, int channelCount, int bitsPerSample ) {
		mAec = null ;
		
		mStartId = 0 ;
		switch( channelCount ) {
			case 1 :
				channelCount = AudioFormat.CHANNEL_IN_MONO ;
				break ;
			case 2 :
				channelCount = AudioFormat.CHANNEL_IN_STEREO ;
				break ;
			default :
				return ;
		}
		switch( bitsPerSample ) {
			case 8 :
				bitsPerSample = AudioFormat.ENCODING_PCM_8BIT ;
				break ;
			case 16 :
				bitsPerSample = AudioFormat.ENCODING_PCM_16BIT ;
				break ;
			default :
				return ;
		}
		
		try {
			AudioRecord audioRecord = new AudioRecord( MediaRecorder.AudioSource.VOICE_COMMUNICATION, sampleRate, channelCount, bitsPerSample, 
				AudioRecord.getMinBufferSize(sampleRate, channelCount, bitsPerSample) ) ;
			mStartId = audioRecord.getAudioSessionId() ;
			audioRecord.release() ;
			Log.e("DAMS","FakeRecorder id is "+mStartId) ;
		} catch( Exception e ) {
			Log.e("DAMS","Failed to create FakeRecorder") ;
		}
	}
	public void useAecHack() {
		if( mAec != null ) {
			return ;
		}
		int winnerId = 0 ;
		for( int id = mStartId ; id <= (mStartId + 100) ; id++ ) {
			AcousticEchoCanceler aec = AcousticEchoCanceler.create(id);
			if( aec != null ) {
				aec.setEnabled(true);
				mAec = aec ;
				winnerId = id ;
				break ;
			}
		}
		if( mAec != null ) {
			Log.e("DAMS","AEC id is "+winnerId) ;
		}
		if( mAec == null && mStartId > 0 ) {
			mStartId = 0 ;
			useAecHack() ;
		}
	}
	public void releaseAec() {
		if( mAec != null ) {
			mAec.setEnabled(false);
			mAec.release() ;
			mAec = null ;
		}
	}
}