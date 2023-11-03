package au.com.softclient.fragmentsdatapass1.fragments3;

import android.app.Application;

public class MyApplication extends Application {
    private String sharedData;

    public String getSharedData() {
        return sharedData;
    }

    public void setSharedData(String data) {
        sharedData = data;
    }
}

