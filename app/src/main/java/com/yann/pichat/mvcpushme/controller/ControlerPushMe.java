package com.yann.pichat.mvcpushme.controller;


import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yann.pichat.mvcpushme.R;
import com.yann.pichat.mvcpushme.affichages.Affichages;
import com.yann.pichat.mvcpushme.logique.EffetSonnore;
import com.yann.pichat.mvcpushme.logique.PushMe;
import com.yann.pichat.mvcpushme.logique.SaveAndLoad;

public class ControlerPushMe {

    public static void clickPushMe(Button button, TextView textView, Context context, PushMe pushme, SaveAndLoad saveAndLoad){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (pushme.isMax()) {
                    pushme.remiseAzero();
                    Affichages.actualisePushMe(textView, pushme.getmNbrPushMe());
                    Affichages.affichePopup(context, R.string.push_me_popup_titre, context.getString(R.string.pusher_popup_message, pushme.getmPushMax()));
                } else {
                    pushme.incrementation();

                }
                EffetSonnore effetSonnore1 = new EffetSonnore(context);
                effetSonnore1.jouerSon(context);
                Affichages.actualisePushMe(textView,pushme.getmNbrPushMe());
                effetSonnore1.closeSong();
                saveAndLoad.saveNbrClickPush(pushme.getmNbrPushMe());
            }
        });

    }



    public static void clickInfoBulle(ImageView imageView, Context context, PushMe pushMe) {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EffetSonnore effetSonnore1 = new EffetSonnore(context);
                effetSonnore1.jouerSon(context);
                effetSonnore1.closeSong();
                Affichages.affichePopup(context, R.string.info_bulle_popup_titre, context.getString(R.string.push_max_popup_messsage, pushMe.getmPushMax()));
            }
        });



    }





}
