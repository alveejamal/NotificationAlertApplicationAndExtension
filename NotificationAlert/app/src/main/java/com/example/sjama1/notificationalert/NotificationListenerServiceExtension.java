package com.example.sjama1.notificationalert;

import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.widget.TextView;

/**
 * Created by sjama1 on 6/10/2017.
 */

public class NotificationListenerServiceExtension extends NotificationListenerService {


    public static final String PHONE_PACK_NAME = "com.android.phone";
    public static final String TEXT_MESSENGER_PACK_NAME = "com.google.android.apps.messaging";
    public static final String WHATSAPP_PACK_NAME = "com.whatsapp";
    public static final String SNAPCHAT_PACK_NAME = "com.snapchat.android";


    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }


    public void onNotificationPosted(StatusBarNotification sbn){
        // Implement what you want here

        String name  = sbn.getPackageName();

        Intent intent = new Intent("com.example.sjama1.notificationalert");
        intent.putExtra("appName", name);
        sendBroadcast(intent);
    }

    public void onNotificationRemoved(StatusBarNotification sbn){
        // Implement what you want here
    }



}
