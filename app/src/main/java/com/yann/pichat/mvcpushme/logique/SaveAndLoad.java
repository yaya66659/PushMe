package com.yann.pichat.mvcpushme.logique;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class SaveAndLoad {

    public SaveAndLoad(Context context){

        this.mContext =context;
        this.mPrefsClickPushMe = this.mContext.getSharedPreferences("SavePushMeClick", Context.MODE_PRIVATE);
    }

    public  void saveNbrClickPush(int nbrClickPush){

        SharedPreferences.Editor editor = mPrefsClickPushMe.edit();
        if(clefIsTrue()) {
            editor.putInt(this.maClefNbrClickPush, nbrClickPush);
            editor.apply();
        }



    }

    public  int chargerNbrClickPushMe(){
        return mPrefsClickPushMe.getInt(maClefNbrClickPush, 0);


    }

    public boolean clefIsTrue(){

       return !this.maClefNbrClickPush.isEmpty();
    }



    public String getMaClefNbrClickPush() {
        return maClefNbrClickPush;
    }

    private  Context mContext;

    private final String maClefNbrClickPush = "clefNbrPush";
   private  SharedPreferences mPrefsClickPushMe;
}
