package com.example.kamanakulkarni.viperdemo.presenter;

import android.content.Context;

import com.example.kamanakulkarni.viperdemo.data_manager.DataManager;
import com.example.kamanakulkarni.viperdemo.data_manager.IDataManager;
import com.example.kamanakulkarni.viperdemo.interactor.ILoginInteractor;
import com.example.kamanakulkarni.viperdemo.interactor.LoginInteractor;
import com.example.kamanakulkarni.viperdemo.router.Router;
import com.example.kamanakulkarni.viperdemo.view.ILoginViewInteractor;

public class LoginPresenter implements ILoginPresenter{

    private Context context;
    private ILoginViewInteractor iLoginViewInteractor;
    private ILoginInteractor iLoginInteractor;

    public LoginPresenter( ILoginViewInteractor iLoginViewInteractor, IDataManager dataManager){

        this.iLoginViewInteractor = iLoginViewInteractor;
        this.iLoginInteractor = new LoginInteractor(context, this,dataManager);
    }

    @Override
    public boolean isUsernameValid(String username) {
        if(username.trim().length()==0){
            iLoginViewInteractor.displayMessage("Field cannot be empty");
            return false;
        }else if (username.trim().length()<4){
            iLoginViewInteractor.displayMessage("Username minimum should be 4 letters long");
            return false;
        }
        return true;
    }

    @Override
    public boolean isPasswordValid(String password) {
        if(password.trim().length()==0){
            iLoginViewInteractor.displayMessage("Field cannot be empty");
            return false;
        }else if (password.trim().length()<4){
            iLoginViewInteractor.displayMessage("Password minimum should be 4 letters long");
            return false;
        }
        return true;
    }

    @Override
    public void launchActivity(String user,String pass) {

        if(!isUsernameValid(user) && !isPasswordValid(pass)) {
            return;
        }

        if(iLoginInteractor.submitLogin(user, pass)){
            Router.launchActivity(context,"HomeActivity");
        }else {
            iLoginViewInteractor.displayMessage("Unknown Error: login data could not be succesfully submitted");
        }

    }
}
