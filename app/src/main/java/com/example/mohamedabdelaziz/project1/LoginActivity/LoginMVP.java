package com.example.mohamedabdelaziz.project1.LoginActivity;

/**
 * Created by Mohamed Abd Elaziz on 10/12/2017.
 */

public interface LoginMVP {
    interface View {

        void setNameError();

        void setPasswordError();

        void progressShow();

        void progressHide();

        void launchHome() ;

        void toastLoginFailed() ;
    }

    interface Presenter {
        void checkInputs(String username, String password);
    }
}
