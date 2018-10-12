package com.example.kamanakulkarni.viperdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kamanakulkarni.viperdemo.R;
import com.example.kamanakulkarni.viperdemo.data_manager.IDataManager;
import com.example.kamanakulkarni.viperdemo.presenter.ILoginPresenter;
import com.example.kamanakulkarni.viperdemo.presenter.LoginPresenter;
import com.example.kamanakulkarni.viperdemo.utils.AppApplication;
import com.example.kamanakulkarni.viperdemo.view.ILoginViewInteractor;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements ILoginViewInteractor {

    @BindView(R.id.etUsername)
    EditText etUsername;

    @BindView(R.id.etPassword)
    EditText etPassword;

    String username, password;

    ILoginPresenter iLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        IDataManager dataManager = ((AppApplication)getApplicationContext()).provideDataManager();
        iLoginPresenter = new LoginPresenter( this, dataManager);

    }

    @OnClick(R.id.btnLogin)
    public void onClickLogin(){
        username = etUsername.getText().toString();
        password = etPassword.getText().toString();
        iLoginPresenter.launchActivity(username,password);
    }

    @Override
    public String getInputUsername() {
        return this.username;
    }

    @Override
    public String getInputPassword() {
        return this.password;
    }

    @Override
    public void displayMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

/*
* View interacts with presenter, presenter interacts with interactor ,
* the navigation from one activity to another is handled by Router,
* Entity is not being used
* */