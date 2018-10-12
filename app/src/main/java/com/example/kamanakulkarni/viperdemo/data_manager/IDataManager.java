package com.example.kamanakulkarni.viperdemo.data_manager;

import android.content.Context;

public interface IDataManager {

    public boolean isFirstTimeUser();

    public void setFirstTimeUser(boolean isFirstTime);

    public void setUsername(String username);

    public void setPassword(String password);

    public String getUsername();

    public String getPassword();

    public Context getContext();

}
