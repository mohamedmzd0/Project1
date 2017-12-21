package com.example.mohamedabdelaziz.project1.Report;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mohamedabdelaziz.project1.R;
import com.example.mohamedabdelaziz.project1.WorkerProfile;

/**
 * Created by Mohamed on 10/27/2017.
 */

public class Fragment4Card2 extends Fragment {
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_report2, null);
        getActivity().setTitle("حالة افراد");
        mRecyclerView = (RecyclerView) view.findViewById(R.id.reportRecycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setAdapter(new Adapter4());

        return view;
    }

    class Adapter4 extends RecyclerView.Adapter<Holder4> {

        @Override
        public Holder4 onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutInflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.view2_card_item, null);
            return new Holder4(layoutInflater);
        }

        @Override
        public void onBindViewHolder(final Holder4 holder, int position) {
            holder.id.setText("" + position);
            holder.name.setText("??");
            holder.status.setText("ظاهر");
            holder.name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(), WorkerProfile.class));
                }
            });
            holder.status.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (holder.name.getText().toString().equals("ظاهر"))
                        holder.name.setText("مخفي");
                    else
                        holder.status.setText("ظاهر");
                }
            });
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }

    class Holder4 extends RecyclerView.ViewHolder {

        TextView id, name, status;

        public Holder4(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.text_item1);
            name = (TextView) itemView.findViewById(R.id.text_item2);
            status = (TextView) itemView.findViewById(R.id.text_item3);

        }
    }
}
