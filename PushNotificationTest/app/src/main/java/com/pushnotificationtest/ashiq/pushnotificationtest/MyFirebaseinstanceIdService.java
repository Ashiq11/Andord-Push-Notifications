package com.pushnotificationtest.ashiq.pushnotificationtest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Ashiq on 8/17/2017.
 */

public class MyFirebaseinstanceIdService extends FirebaseInstanceIdService {
    private static  final String REG_TOKEN="REG_TOKEN";

    @Override
    public void onTokenRefresh() {
        String recent_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,recent_token);

    }
}
