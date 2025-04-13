package com.yann.pichat.mvcpushme.logique;

import android.content.Context;
import android.media.MediaPlayer;

import com.yann.pichat.mvcpushme.R;

public class EffetSonnore {
    public EffetSonnore(Context context)
    {
        this.mMediaPlayer = MediaPlayer.create(context, R.raw.son_click);
    }

    public  void jouerSon(Context context){

        this.mMediaPlayer.start();
    }

    public void closeSong(){
        this.mMediaPlayer.setOnCompletionListener(MediaPlayer::release);
    }

private  MediaPlayer mMediaPlayer;


}
