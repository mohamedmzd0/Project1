package com.example.mohamedabdelaziz.project1.SecondFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mohamedabdelaziz.project1.R;

public class AddNewCompany extends AppCompatActivity {

    private EditText company_name, response_name, phone, notes;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_company);
        company_name = (EditText) findViewById(R.id.company_name);
        response_name = (EditText) findViewById(R.id.respone_name);
        phone = (EditText) findViewById(R.id.phone);
        notes = (EditText) findViewById(R.id.notes);
        add = (Button) findViewById(R.id.add_BTN);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(company_name.getText().toString())) {
                    company_name.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(response_name.getText().toString())) {
                    response_name.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(phone.getText().toString())) {
                    phone.setError("مطلوب");
                    return;
                }
                if (phone.getText().toString().length() != 11 || !phone.getText().toString().startsWith("01")) {
                    phone.setError("غير صحيح");
                    return;

                }
            }
        });

    }
}
