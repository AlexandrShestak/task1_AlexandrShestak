package com.alexandrshestak.task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.crashlytics.android.Crashlytics;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.distribute.Distribute;

import io.fabric.sdk.android.Fabric;

/**
 *Main activity.
 */
public class MainActivity extends AppCompatActivity {

    private static final String APP_CENTER_KEY = "43160772-9689-4752-8b19-eb89945e78b8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        AppCenter.start(getApplication(), APP_CENTER_KEY, Distribute.class);

        setContentView(R.layout.activity_main);
    }


    /** Called when the user taps the Send button. */
    public void sendMessage(View view) {
        // Do something in response to button
    }
}
