package com.example.kamanakulkarni.viperdemo.utils;

import android.app.Application;

import com.example.kamanakulkarni.viperdemo.data_manager.DataManager;
import com.example.kamanakulkarni.viperdemo.data_manager.IDataManager;
import com.example.kamanakulkarni.viperdemo.data_manager.SharedPrefHelper;

public class AppApplication extends Application {

    IDataManager dataManager;

    SharedPrefHelper sharedPrefHelper;
    @Override
    public void onCreate() {
        super.onCreate();
        sharedPrefHelper = new SharedPrefHelper(this);
        dataManager = new DataManager(this, sharedPrefHelper);

    }

    public IDataManager provideDataManager(){
        return dataManager;
    }
}
