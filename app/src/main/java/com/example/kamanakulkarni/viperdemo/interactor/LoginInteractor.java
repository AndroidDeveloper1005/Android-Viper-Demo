package com.example.kamanakulkarni.viperdemo.interactor;

import android.content.Context;

import com.example.kamanakulkarni.viperdemo.data_manager.IDataManager;
import com.example.kamanakulkarni.viperdemo.presenter.ILoginPresenter;

public class LoginInteractor implements ILoginInteractor {

    Context context;
    private ILoginPresenter iLoginPresenter;
    IDataManager dataManager;

    public LoginInteractor(Context context, ILoginPresenter iLoginPresenter, IDataManager dataManager) {
        this.dataManager = dataManager;
        this.context = context;
        this.iLoginPresenter = iLoginPresenter;
    }

    @Override
    public boolean isFirstTimeUser(String username, String password) {
        return dataManager.isFirstTimeUser();
    }

    @Override
    public void setFirstTimeUser(boolean isFirstTime) {
       dataManager.setFirstTimeUser(isFirstTime);
    }

    @Override
    public void setUsername(String username) {
        dataManager.setUsername(username);
    }

    @Override
    public void setPassword(String password) {
        dataManager.setPassword(password);
    }

    @Override
    public String getUsername() {
        return dataManager.getUsername();
    }

    @Override
    public String getPassword() {
        return dataManager.getPassword();
    }

    @Override
    public boolean submitLogin(String username, String password) {
        if (isFirstTimeUser(username, password)) {
            setFirstTimeUser(true); //TODO need to set after  getting success response .
            setUsername(username);
            setPassword(password);

            return true;
        }
        return false;
    }
}
