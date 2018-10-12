package com.example.kamanakulkarni.viperdemo.view;

public interface ILoginViewInteractor {

    public String getInputUsername();
    public String getInputPassword();
    public void displayMessage(String field_cannot_be_empty);
}
