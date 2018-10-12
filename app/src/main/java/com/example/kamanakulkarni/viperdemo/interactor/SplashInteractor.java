package com.example.kamanakulkarni.viperdemo.interactor;

import com.example.kamanakulkarni.viperdemo.data_manager.IDataManager;

public class SplashInteractor implements ISplashInteractor{

    IDataManager dataManager;

    public SplashInteractor(IDataManager dataManager){
        this.dataManager = dataManager;
    }

    @Override
    public boolean performActivityLaunch() {
        return dataManager.isFirstTimeUser();
    }
}
