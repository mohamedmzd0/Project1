package com.example.mohamedabdelaziz.project1.SecondFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.mohamedabdelaziz.project1.R;

public class AddNewProject extends AppCompatActivity {

    private Spinner mSpinner;
    private EditText project_name, respone_name, response_phone, respone2_name, response2_phone, notes;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_project);
        mSpinner = (Spinner) findViewById(R.id.spinner);
        project_name = (EditText) findViewById(R.id.project_name);
        respone_name = (EditText) findViewById(R.id.project_response);
        response_phone = (EditText) findViewById(R.id.respone_phone);
        respone2_name = (EditText) findViewById(R.id.respone2_name);
        response2_phone = (EditText) findViewById(R.id.respone2_phone);
        notes = (EditText) findViewById(R.id.notes);
        add = (Button) findViewById(R.id.add_BTN);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(project_name.getText().toString())) {
                    project_name.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(respone_name.getText().toString())) {
                    respone_name.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(response_phone.getText().toString())) {
                    response_phone.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(respone2_name.getText().toString())) {
                    respone2_name.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(response2_phone.getText().toString())) {
                    response2_phone.setError("مطلوب");
                    return;
                }
                if (response2_phone.getText().toString().length() != 11 || !response2_phone.getText().toString().startsWith("01")) {
                    response2_phone.setError("غير صحيح");
                    return;
                }
                if (response_phone.getText().toString().length() != 11 || !response_phone.getText().toString().startsWith("01")) {
                    response_phone.setError("غير صحيح");
                    return;
                }


            }
        });

    }
}
