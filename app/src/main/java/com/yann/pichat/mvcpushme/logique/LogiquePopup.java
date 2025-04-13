package com.yann.pichat.mvcpushme.logique;

import androidx.appcompat.app.AlertDialog;

import java.io.Serializable;

public class LogiquePopup {

    public static void popupTitre(Object titre, AlertDialog.Builder popup) {
        if (titre instanceof String) {
            popup.setTitle((String) titre);
        } else if (titre instanceof Integer) {
            popup.setTitle((Integer) titre);
        } else {
            popup.setTitle("Erreure");
        }
    }


    public static void popupMessage(Object message,AlertDialog.Builder popup) {
        if (message instanceof String) {
           popup.setMessage((String) message);
        } else if (message instanceof Integer) {
            popup.setMessage((Integer) message);
        } else {
            popup.setMessage("Erreure");
        }
    }

}