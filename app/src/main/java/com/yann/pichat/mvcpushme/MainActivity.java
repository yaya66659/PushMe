package com.yann.pichat.mvcpushme;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.yann.pichat.mvcpushme.affichages.Affichages;
import com.yann.pichat.mvcpushme.controller.ControlerPushMe;
import com.yann.pichat.mvcpushme.logique.EffetSonnore;
import com.yann.pichat.mvcpushme.logique.PushMe;
import com.yann.pichat.mvcpushme.logique.SaveAndLoad;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
        SaveAndLoad saveAndLoad = new SaveAndLoad(MainActivity.this);
        PushMe pushMe = new PushMe((int) saveAndLoad.chargerNbrClickPushMe());

        this.mPushMeTextView = (TextView) findViewById(R.id.nbrPush);
        this.mInfoBulle = (ImageView) findViewById(R.id.infoBulle);
        this.mBtnPushMe = (Button)  findViewById(R.id.pushMeBtn);
        this.mNbrMaxPushMe =(TextView) findViewById(R.id.maxPush);

        Affichages.actualisePushMe(this.mPushMeTextView, pushMe.getmNbrPushMe());
        Affichages.afficheMaxPush(mNbrMaxPushMe, pushMe.getmPushMax());


        ControlerPushMe.clickInfoBulle(mInfoBulle, MainActivity.this, pushMe);

        ControlerPushMe.clickPushMe(mBtnPushMe,mPushMeTextView,MainActivity.this, pushMe , saveAndLoad);





    }

    public Button getmBtnPushMe() {
        return  this.mBtnPushMe;
    }

    public ImageView getmInfoBulle() {
        return  this.mInfoBulle;
    }

    public TextView getmPushMeTextView() {
        return this.mPushMeTextView;
    }

    private   ImageView mInfoBulle;
    private  Button mBtnPushMe;
    private  TextView mPushMeTextView;
    private TextView mNbrMaxPushMe;

}