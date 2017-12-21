package com.example.mohamedabdelaziz.project1.Report;

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

/**
 * Created by Mohamed on 10/27/2017.
 */

public class Fragment6Card3 extends Fragment {
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_report, null);
        getActivity().setTitle("تقرير اجمالى");
        mRecyclerView = (RecyclerView) view.findViewById(R.id.reportRecycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setAdapter(new Adapter6());

        return view;
    }

    class Adapter6 extends RecyclerView.Adapter<Holder6> {

        @Override
        public Holder6 onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutInflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.view3_card_item, null);
            return new Holder6(layoutInflater);
        }

        @Override
        public void onBindViewHolder(Holder6 holder, int position) {
            holder.name.setText("??");
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }

    class Holder6 extends RecyclerView.ViewHolder {

        TextView  name;

        public Holder6(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.text_item2);
        }
    }
}
