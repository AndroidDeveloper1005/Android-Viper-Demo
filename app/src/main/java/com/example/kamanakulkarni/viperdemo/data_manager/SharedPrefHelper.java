package com.example.kamanakulkarni.viperdemo.data_manager;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.kamanakulkarni.viperdemo.utils.Constant;

public class SharedPrefHelper {

    Context context;

    SharedPreferences mSharedPrefHelper;

    public SharedPrefHelper(Context context){
        this.context = context;
        mSharedPrefHelper = context.getSharedPreferences(Constant.ISharedPrefHelper.PREF_APP, Context.MODE_PRIVATE);
    }

    public boolean isFirstTimeUser() {
        return mSharedPrefHelper.getBoolean(Constant.ISharedPrefHelper.PREF_IS_FIRST_TIME_LOGIN,false);
    }

    public void setFirstTimeUser(boolean isFirstTime) {
        mSharedPrefHelper.edit().putBoolean(Constant.ISharedPrefHelper.PREF_IS_FIRST_TIME_LOGIN, isFirstTime).apply();
    }

    public void setUsername(String username) {
        mSharedPrefHelper.edit().putString(Constant.ISharedPrefHelper.PREF_USERNAME, username).apply();
    }

    public void setPassword(String password) {
        mSharedPrefHelper.edit().putString(Constant.ISharedPrefHelper.PREF_PASSWORD, password).apply();
    }

    public String getUsername() {
        return mSharedPrefHelper.getString(Constant.ISharedPrefHelper.PREF_USERNAME, "");
    }

    public String getPassword() {
        return mSharedPrefHelper.getString(Constant.ISharedPrefHelper.PREF_PASSWORD, "");
    }

}
