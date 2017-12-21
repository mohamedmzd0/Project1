package com.example.mohamedabdelaziz.project1.SecondFragment.Model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.mohamedabdelaziz.project1.R;

/**
 * Created by Mohamed Abd Elaziz on 10/17/2017.
 */

public class Recycler2Adapter extends RecyclerView.Adapter<Recycler2Holder> {

    @Override
    public Recycler2Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card2_recycler_fragment2_item, null);
        return new Recycler2Holder(view);
    }

    @Override
    public void onBindViewHolder(Recycler2Holder holder, int position) {
        holder.text1.setText("شركه 1 مشروع 1");
        holder.text3.setText("65%");
        holder.text2.setText("2000  ");
    }

    public int getItemCount() {
        return 3;
    }
}

class Recycler2Holder extends RecyclerView.ViewHolder {

    TextView text1, text2, text3;

    public Recycler2Holder(View itemView) {
        super(itemView);
        text1 = (TextView) itemView.findViewById(R.id.text1);
        text2 = (TextView) itemView.findViewById(R.id.text2);
        text3 = (TextView) itemView.findViewById(R.id.text3);

    }
}


