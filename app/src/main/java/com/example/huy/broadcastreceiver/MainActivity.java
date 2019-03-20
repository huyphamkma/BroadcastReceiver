package com.example.huy.broadcastreceiver;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private NetworkChange mNetworkChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNetworkChange = new NetworkChange();
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(mNetworkChange, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(mNetworkChange);
    }
}
