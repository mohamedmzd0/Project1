package com.example.mohamedabdelaziz.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CompanyEdit extends AppCompatActivity {

    private EditText company_name, response_name, response_phone, notes, date;
    private Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_edit);
        company_name = (EditText) findViewById(R.id.company_name);
        response_name = (EditText) findViewById(R.id.respone_name);
        response_phone = (EditText) findViewById(R.id.respone_phone);
        notes = (EditText) findViewById(R.id.notes);
        date = (EditText) findViewById(R.id.date);
        update = (Button) findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(company_name.getText().toString())) {
                    company_name.setError(getString(R.string.required));
                    return;
                }
                if (TextUtils.isEmpty(response_name.getText().toString())) {
                    response_name.setError(getString(R.string.required));
                    return;
                }
                if (TextUtils.isEmpty(response_phone.getText().toString())) {
                    response_phone.setError(getString(R.string.required));
                    return;
                }
                if (TextUtils.isEmpty(date.getText().toString())) {
                    date.setError(getString(R.string.required));
                    return;
                }
                if (response_phone.getText().toString().length() != 11) {
                    company_name.setError(getString(R.string.error));
                    return;
                }

            }
        });
    }
}
