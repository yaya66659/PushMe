package com.yann.pichat.mvcpushme.affichages;

import android.content.Context;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.yann.pichat.mvcpushme.logique.LogiquePopup;


public class Affichages {




    public static void affichePopup(Context context, Object titre ,Object message) {


    AlertDialog.Builder popup = new AlertDialog.Builder(context);
      LogiquePopup.popupTitre(titre, popup);
      LogiquePopup.popupMessage(message, popup);
        popup.setPositiveButton("Ok", null);
        popup.show();
    }

    public static void afficheMaxPush(TextView textView, int maxPush){
        textView.setText(String.valueOf(maxPush));
    }

    public static void actualisePushMe(TextView push, int pushMe){
        push.setText(String.valueOf(pushMe));
    }





}
