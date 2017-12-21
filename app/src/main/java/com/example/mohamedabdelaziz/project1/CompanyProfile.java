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

import com.example.mohamedabdelaziz.project1.Report.Fragment4Card2;

public class CompanyProfile extends AppCompatActivity {

    private TextView company_name, response_name, phone, date;
    private RecyclerView mRecyclerView;
    private FloatingActionButton edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_profile);
        company_name = (TextView) findViewById(R.id.text1);
        response_name = (TextView) findViewById(R.id.text2);
        phone = (TextView) findViewById(R.id.text3);
        date = (TextView) findViewById(R.id.text4);
        edit= (FloatingActionButton) findViewById(R.id.edit_fab) ;
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CompanyEdit.class));
            }
        });
        ///////////////////////////////////////////
        company_name.setText("ابراج المحمديه");
        response_name.setText("أسم المسؤل: صبرى السعدنى");
        phone.setText("رقم المسؤل:1125323518");
        date.setText("بدايه تنفيذ مشروعات الشركه:2017-09-15");
        ////////////////////////////////////////
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setAdapter(new Adapter());

    }

    class Adapter extends RecyclerView.Adapter<Holder> {

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutInflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.view5_item, null);
            return new Holder(layoutInflater);
        }

        @Override
        public void onBindViewHolder(final Holder holder, int position) {
            holder.imagestatus.setImageResource(R.drawable.delete);
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

        ImageView imagestatus;
        TextView profit, revenue, expense, project;

        public Holder(View itemView) {
            super(itemView);
            imagestatus = (ImageView) itemView.findViewById(R.id.images);
            profit = (TextView) itemView.findViewById(R.id.text2);
            revenue = (TextView) itemView.findViewById(R.id.text3);
            expense = (TextView) itemView.findViewById(R.id.text4);
            project = (TextView) itemView.findViewById(R.id.text5);

        }
    }
}
