package com.example.kamanakulkarni.viperdemo.presenter;

import android.os.Handler;

import com.example.kamanakulkarni.viperdemo.data_manager.DataManager;
import com.example.kamanakulkarni.viperdemo.data_manager.IDataManager;
import com.example.kamanakulkarni.viperdemo.interactor.ISplashInteractor;
import com.example.kamanakulkarni.viperdemo.interactor.SplashInteractor;
import com.example.kamanakulkarni.viperdemo.router.Router;

public class SplashPresenter extends BasePresenter implements ISplashPresenter{

    ISplashInteractor iSplashInteractor;
    private IDataManager dataManager;

    public SplashPresenter(IDataManager dataManager){
        this.dataManager = dataManager;
        iSplashInteractor = new SplashInteractor(dataManager);
    }

    @Override
    public void launchAction() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(iSplashInteractor.performActivityLaunch()){
                    Router.launchActivity(dataManager.getContext(), "LoginActivity");
                }else {
                    Router.launchActivity(dataManager.getContext(), "HomeActivity");
                }
            }
        },2000);

    }
}
