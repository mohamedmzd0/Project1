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

public class Recycler1Adapter extends RecyclerView.Adapter<Recycler1Holder> {
    @Override
    public Recycler1Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1_recycler_fragment2_item, null);
        return new Recycler1Holder(view);
    }

    @Override
    public void onBindViewHolder(Recycler1Holder holder, int position) {
    holder.text1.setText("شركه 1");
        holder.progressBar.setProgress(60);
        holder.progressBar.setMax(100);
        holder.text2.setText("2000 $ ");
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

class Recycler1Holder extends RecyclerView.ViewHolder {

    TextView text1, text2;
    ProgressBar progressBar;

    public Recycler1Holder(View itemView) {
        super(itemView);
        text1 = (TextView) itemView.findViewById(R.id.text1);
        text2 = (TextView) itemView.findViewById(R.id.text2);
        progressBar = (ProgressBar) itemView.findViewById(R.id.progress);
    }
}
