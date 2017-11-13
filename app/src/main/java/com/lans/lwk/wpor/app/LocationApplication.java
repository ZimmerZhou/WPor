package com.lans.lwk.wpor.app;


import android.app.Application;
import android.app.Service;
import android.os.Vibrator;

import com.lans.lwk.wpor.LocationService;



public class LocationApplication extends Application {
	public static LocationService locationService;
    public Vibrator mVibrator;
    @Override
    public void onCreate() {
        super.onCreate();

        locationService = new LocationService(getApplicationContext());
        mVibrator =(Vibrator)getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);
        //SDKInitializer.initialize(getApplicationContext());

    }
    public static LocationService getLocationSer(){
        if(locationService!=null){
            return locationService;
        }
        return null;
    }

}
