package com.example.qracutie;

import android.provider.MediaStore;

import java.util.HashMap;

public class Player {

    String playerQRCode;
    String userName;
    String email;
    String phoneNumber;

    int pointTotal;
    String highestPointQRCode;

    GameQRCode[] scannedCodes;

    HashMap<String, MediaStore.Images> imagesHashMap = new HashMap<String, MediaStore.Images>();

}
