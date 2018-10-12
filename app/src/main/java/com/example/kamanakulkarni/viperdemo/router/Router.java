package com.example.kamanakulkarni.viperdemo.router;

import android.content.Context;
import android.content.Intent;

import com.example.kamanakulkarni.viperdemo.view.LoginActivity;
import com.example.kamanakulkarni.viperdemo.data_manager.RouterEnum;
import com.example.kamanakulkarni.viperdemo.view.HomeActivity;
import com.example.kamanakulkarni.viperdemo.view.SplashActivity;

public class Router {

    public static void launchActivity(Context context, String activityName) {

        Intent intent = null;
        if(activityName.equalsIgnoreCase(RouterEnum.LoginActivity.toString())) {
            intent = getLoginActivityIntent(context, RouterEnum.LoginActivity);
        }

        else if(activityName.equalsIgnoreCase(RouterEnum.HomeActivity.toString())){
            intent = getLoginActivityIntent(context, RouterEnum.HomeActivity);
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    private static Intent getLoginActivityIntent(Context context, RouterEnum activityName) {
        switch (activityName) {

            case LoginActivity:
                return new Intent(context, LoginActivity.class);

            case HomeActivity:
                return new Intent(context, HomeActivity.class);

            default:
                return new Intent(context, SplashActivity.class);
        }
    }
}
