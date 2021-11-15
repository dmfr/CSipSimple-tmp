/**
 * Copyright (C) 2010-2012 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimple.
 *
 *  CSipSimple is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  If you own a pjsip commercial license you can also redistribute it
 *  and/or modify it under the terms of the GNU Lesser General Public License
 *  as an android library.
 *
 *  CSipSimple is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CSipSimple.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.csipsimple.ui.prefs;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import com.csipsimple.R;
import com.csipsimple.api.SipConfigManager;
import com.csipsimple.ui.calllog.CallLogListFragment;
import com.csipsimple.utils.Log;

import java.util.ArrayList;
import java.util.List;

public class Codecs extends Activity implements ActionBar.TabListener {

	protected static final String THIS_FILE = "Codecs";
    //private ViewPager mViewPager;
    private boolean useCodecsPerSpeed = true;
    private boolean showVideoCodecs = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        setContentView(R.layout.codecs_pager);

        final ActionBar ab = getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayShowTitleEnabled(true);
        
        //mViewPager = (ViewPager) findViewById(R.id.pager);
        //TabsAdapter tabAdapter = new TabsAdapter(this, ab, mViewPager);
        useCodecsPerSpeed = SipConfigManager.getPreferenceBooleanValue(this, SipConfigManager.CODECS_PER_BANDWIDTH);
        showVideoCodecs   = SipConfigManager.getPreferenceBooleanValue(this, SipConfigManager.USE_VIDEO);
        if(useCodecsPerSpeed) {
            ActionBar.Tab audioNb = ab.newTab().setText( R.string.slow ).setIcon(R.drawable.ic_prefs_media);
            audioNb.setTabListener(this) ;
            ab.addTab(audioNb);

            ActionBar.Tab audioWb = ab.newTab().setText( R.string.fast ).setIcon(R.drawable.ic_prefs_media);
            audioWb.setTabListener(this) ;
            ab.addTab(audioWb);

             if(showVideoCodecs) {
                Tab videoNb = ab.newTab().setText( R.string.slow ).setIcon(R.drawable.ic_prefs_media_video);
                videoNb.setTabListener(this) ;
                ab.addTab(videoNb);

                Tab videoWb = ab.newTab().setText( R.string.fast ).setIcon(R.drawable.ic_prefs_media_video);
                 videoWb.setTabListener(this) ;
                ab.addTab(videoWb);
            }
        }else {
            Tab audioTab = ab.newTab().setIcon(R.drawable.ic_prefs_media);
            audioTab.setTabListener(this) ;
            ab.addTab(audioTab);

            if(showVideoCodecs) {
                Tab videoTab = ab.newTab().setIcon(R.drawable.ic_prefs_media_video);
                videoTab.setTabListener(this) ;
                ab.addTab(videoTab);
            }
        }
	}


    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
	    Integer position = tab.getPosition() ;

        CodecsFragment f = new CodecsFragment();
        Bundle args = new Bundle();
        if(useCodecsPerSpeed) {
            args.putString(CodecsFragment.BAND_TYPE, (position % 2 == 0)? SipConfigManager.CODEC_WB : SipConfigManager.CODEC_NB );
            args.putInt(CodecsFragment.MEDIA_TYPE, (position < 2)? CodecsFragment.MEDIA_AUDIO : CodecsFragment.MEDIA_VIDEO );
        }else {
            args.putString(CodecsFragment.BAND_TYPE, SipConfigManager.CODEC_WB );
            args.putInt(CodecsFragment.MEDIA_TYPE, (position < 1)? CodecsFragment.MEDIA_AUDIO : CodecsFragment.MEDIA_VIDEO );
        }
        f.setArguments(args);

        ft.replace(R.id.pager, (Fragment)f, "visible_fragment");
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {

    }
}
