package com.example.mohamedabdelaziz.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WorkerProfile extends AppCompatActivity {

    private ImageView profile_image;
    private TextView name, work, phone, money;
    private RecyclerView mRecyclerView;
    private FloatingActionButton edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_profile);
        profile_image = (ImageView) findViewById(R.id.imge_profile);
        name = (TextView) findViewById(R.id.text1);
        work = (TextView) findViewById(R.id.text2);
        phone = (TextView) findViewById(R.id.text3);
        money = (TextView) findViewById(R.id.text4);
        edit = (FloatingActionButton) findViewById(R.id.update);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProjectEdit.class));
            }
        });
        /////////////////////////////////////////
        name.setText("حسن ");
        work.setText("سباك");
        phone.setText("011");
        money.setText("لاجر المستحق: 0");
        /////////////////////////////////////////

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setAdapter(new Adapter());

    }

    class Adapter extends RecyclerView.Adapter<Holder> {
        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view4_item, null);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.item1.setText("??");
            holder.item2.setText("??");
            holder.item3.setText("??");
            holder.item4.setText("??");
            holder.item5.setText("??");
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }

    class Holder extends RecyclerView.ViewHolder {

        TextView item1, item2, item3, item4, item5;

        public Holder(View itemView) {
            super(itemView);
            item1 = (TextView) itemView.findViewById(R.id.text1);
            item2 = (TextView) itemView.findViewById(R.id.text2);
            item3 = (TextView) itemView.findViewById(R.id.text3);
            item4 = (TextView) itemView.findViewById(R.id.text4);
            item5 = (TextView) itemView.findViewById(R.id.text5);
        }
    }
}
