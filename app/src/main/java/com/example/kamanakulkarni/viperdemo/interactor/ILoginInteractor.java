package com.example.kamanakulkarni.viperdemo.interactor;

public interface ILoginInteractor {

    public boolean isFirstTimeUser(String username, String password);

    public void setFirstTimeUser(boolean isFirstTime);

    public void setUsername(String username);

    public void setPassword(String password);

    public String getUsername();

    public String getPassword();

    public boolean submitLogin(String username, String password);
}
