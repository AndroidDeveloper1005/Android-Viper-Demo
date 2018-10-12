package com.example.kamanakulkarni.viperdemo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.kamanakulkarni.viperdemo.utils.AppApplication;
import com.example.kamanakulkarni.viperdemo.R;
import com.example.kamanakulkarni.viperdemo.data_manager.IDataManager;
import com.example.kamanakulkarni.viperdemo.presenter.ISplashPresenter;
import com.example.kamanakulkarni.viperdemo.presenter.SplashPresenter;

public class SplashActivity extends AppCompatActivity {

    ISplashPresenter iSplashPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        IDataManager dataManager = ((AppApplication)getApplication()).provideDataManager();
        iSplashPresenter = new SplashPresenter(dataManager);
        iSplashPresenter.launchAction();
    }
}
