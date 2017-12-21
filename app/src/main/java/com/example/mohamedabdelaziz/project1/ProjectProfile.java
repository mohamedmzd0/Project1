package com.example.mohamedabdelaziz.project1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProjectProfile extends AppCompatActivity {

    private TextView company_name, project_name, response_name, response2_name, profits, imcomes, payments;
    private RecyclerView mRecyclerView;
    private FloatingActionButton edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_profile2);
        company_name = (TextView) findViewById(R.id.text1);
        project_name = (TextView) findViewById(R.id.text2);
        response_name = (TextView) findViewById(R.id.text3);
        response2_name = (TextView) findViewById(R.id.text4);
        profits = (TextView) findViewById(R.id.text5);
        imcomes = (TextView) findViewById(R.id.text6);
        payments = (TextView) findViewById(R.id.text7);
        edit = (FloatingActionButton) findViewById(R.id.edit_fab);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProjectEdit.class));
            }
        });
//////////////////////////////////////////////////
        company_name.setText("شركه 1");
        project_name.setText("مشروع 1 شركه1 ");
        response_name.setText("المسؤل عن المشروع: مسؤل 1 شركه 1 / 112532351");
        response2_name.setText("لمكلف بالمشروع : مكلف 1 شركه 2 / 1125323518 ");
        profits.setText("ارباح :0");
        imcomes.setText("ايرادات :0");
        payments.setText("مصاريف :0");
        ///////////////////////////////
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setAdapter(new Adapter());

    }

    class Adapter extends RecyclerView.Adapter<Holder> {

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutInflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.view4_item, null);
            return new Holder(layoutInflater);
        }

        @Override
        public void onBindViewHolder(final Holder holder, int position) {
            holder.date.setText("22/20172");
            holder.project.setText("مهجن");
            holder.profit.setText("555");
            holder.expense.setText("255");
            holder.revenue.setText("7000");
            holder.project.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), ProjectProfile.class));
                }
            });

        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }

    class Holder extends RecyclerView.ViewHolder {


        TextView date, profit, revenue, expense, project;

        public Holder(View itemView) {
            super(itemView);
            date = (TextView) itemView.findViewById(R.id.text1);
            profit = (TextView) itemView.findViewById(R.id.text2);
            revenue = (TextView) itemView.findViewById(R.id.text3);
            expense = (TextView) itemView.findViewById(R.id.text4);
            project = (TextView) itemView.findViewById(R.id.text5);

        }
    }
}
