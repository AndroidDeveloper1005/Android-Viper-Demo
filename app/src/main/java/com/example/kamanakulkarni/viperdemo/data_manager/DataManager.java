package com.example.kamanakulkarni.viperdemo.data_manager;

import android.content.Context;

public class DataManager implements IDataManager{

    private SharedPrefHelper sharedPrefHelper;

    private Context context;

    public DataManager(Context context, SharedPrefHelper sharedPrefHelper){
        this.context = context;
        this.sharedPrefHelper = sharedPrefHelper;
    }

    @Override
    public boolean isFirstTimeUser() {
        return !sharedPrefHelper.isFirstTimeUser();
    }

    @Override
    public void setFirstTimeUser(boolean isFirstTime){
        sharedPrefHelper.setFirstTimeUser(isFirstTime);
    }

    @Override
    public void setUsername(String username){
        sharedPrefHelper.setUsername(username);
    }

    @Override
    public void setPassword(String password){
        sharedPrefHelper.setPassword(password);
    }

    @Override
    public String getUsername() {
        return sharedPrefHelper.getUsername();
    }

    @Override
    public String getPassword(){
        return sharedPrefHelper.getPassword();
    }

    @Override
    public Context getContext() {
        return context;
    }
}
