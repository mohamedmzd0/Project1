package com.example.mohamedabdelaziz.project1.SecondFragment.Model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

import com.example.mohamedabdelaziz.project1.R;
import com.example.mohamedabdelaziz.project1.SecondFragment.AddNewCompany;
import com.example.mohamedabdelaziz.project1.SecondFragment.AddNewProject;
import com.example.mohamedabdelaziz.project1.SecondFragment.NewWorker;

public class NewAddDialog extends AppCompatActivity {

    private Button addworker, addcompany, addproject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_add_dialog);

        addworker = (Button) findViewById(R.id.newWorker);
        addcompany = (Button) findViewById(R.id.newCompany);
        addproject = (Button) findViewById(R.id.newProject);

        addworker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NewWorker.class));
                finish();
            }
        });
        addproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddNewProject.class));
                finish();
            }
        });
        addcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddNewCompany.class));
                finish();
            }
        });
    }
}
