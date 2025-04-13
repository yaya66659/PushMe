package com.yann.pichat.mvcpushme.logique;

public class PushMe {

    public PushMe()
    {
        this.mNbrPushMe = 0;
    }
    public PushMe(int nbrPush){
        this.mNbrPushMe = nbrPush;
    }

    public void incrementation(){
        this.mNbrPushMe++;
    }

    public void remiseAzero(){
        this.mNbrPushMe = 0;
    }

    public boolean isMax(){
       return this.mNbrPushMe>=this.mPushMax;
    }

    public void changerNbrMaxPush(int nouveauNbrMaxPush){
        this.mPushMax = nouveauNbrMaxPush;
    }

    public int getmNbrPushMe() {
        return this.mNbrPushMe;
    }

       public int getmPushMax() {
        return this.mPushMax;
    }

    private  int mNbrPushMe;

    private  int mPushMax = 5;
}
