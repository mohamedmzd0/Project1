package com.example.mohamedabdelaziz.project1.LoginActivity;

import android.text.TextUtils;

import org.w3c.dom.Text;

/**
 * Created by Mohamed Abd Elaziz on 10/12/2017.
 */

public class Presenter implements LoginMVP.Presenter {
    LoginMVP.View mView;

    public Presenter(LoginMVP.View mView) {
        this.mView = mView;
    }

    @Override
    public void checkInputs(String username, String password) {
        mView.progressShow();
        if (TextUtils.isEmpty(username)) {
            mView.setNameError();
            mView.progressHide();
        } else if (TextUtils.isEmpty(password)) {
            mView.setPasswordError();
            mView.progressHide();
        } else if (username.equals("ali") && password.equals("123")) {
            mView.launchHome();
        } else {
            mView.toastLoginFailed();
            mView.progressHide();
        }

    }
}
