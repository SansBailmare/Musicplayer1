package com.example.android.musicplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

import static android.R.attr.id;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by SANKET on 3/8/2017.import static android.os.Build.VERSION_CODES.M;

 */

public class media {
    private String lsong;
    private int audioname;
    public media(String s_name,int audioFile){
        lsong=s_name;
        audioname=audioFile;
    }

 public String getsong(){
     return lsong;
 }

public int getAudioname()
{
    return audioname;
}
}
