package com.example.mohamedabdelaziz.project1.LoginActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mohamedabdelaziz.project1.HomePage.Home;
import com.example.mohamedabdelaziz.project1.R;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class LoginAcivity extends AppCompatActivity implements LoginMVP.View {
    private EditText mEditText_username, mEditText_Password;
    private Button mButton_login;
    private Presenter mPresenter;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acivity);
        mEditText_username = (EditText) findViewById(R.id.name_edit_text);
        mEditText_Password = (EditText) findViewById(R.id.password_edit_text);
        mButton_login = (Button) findViewById(R.id.login_btn);
        mPresenter = new Presenter(this);
        mButton_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.checkInputs(mEditText_username.getText().toString(), mEditText_Password.getText().toString());
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("username", mEditText_username.getText().toString());
        outState.putString("password", mEditText_Password.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mEditText_username.setText(savedInstanceState.getString("username"));
        mEditText_Password.setText(savedInstanceState.getString("password"));

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void setNameError() {
        mEditText_username.setError(getString(R.string.username_required));
    }

    @Override
    public void setPasswordError() {
        mEditText_Password.setError(getString(R.string.password_required));
    }

    @Override
    public void progressShow() {
        mProgressDialog = ProgressDialog.show(this, "",
                getResources().getString(R.string.login_message), true);
        mProgressDialog.setCancelable(false);
    }

    @Override
    public void progressHide() {
        mProgressDialog.dismiss();
    }

    @Override
    public void launchHome() {
        startActivity(new Intent(getApplicationContext(), Home.class));
        finish();
    }

    @Override
    public void toastLoginFailed() {
        Toast.makeText(this, R.string.loginFailedMessage, Toast.LENGTH_SHORT).show();
    }


}
