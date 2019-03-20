package com.example.huy.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class NetworkChange extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getActiveNetworkInfo() != null){
            Toast.makeText(context, "Network ON", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Network OFF", Toast.LENGTH_SHORT).show();
        }
    }
}
