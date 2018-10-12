package com.example.kamanakulkarni.viperdemo.presenter;

public interface ILoginPresenter {

    public boolean isUsernameValid(String username);
    public boolean isPasswordValid(String password);
    public void launchActivity(String username,String pass);
}
