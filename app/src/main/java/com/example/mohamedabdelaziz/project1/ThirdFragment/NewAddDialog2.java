package com.example.mohamedabdelaziz.project1.ThirdFragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mohamedabdelaziz.project1.R;
import com.example.mohamedabdelaziz.project1.SecondFragment.AddNewCompany;
import com.example.mohamedabdelaziz.project1.SecondFragment.AddNewProject;
import com.example.mohamedabdelaziz.project1.SecondFragment.NewWorker;

public class NewAddDialog2 extends AppCompatActivity {
    private Button addcompany, addproject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_add_dialog2);
        addcompany = (Button) findViewById(R.id.newCompany);
        addproject = (Button) findViewById(R.id.newProject);

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
