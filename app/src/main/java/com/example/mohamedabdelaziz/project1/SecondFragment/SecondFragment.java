package com.example.mohamedabdelaziz.project1.SecondFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mohamedabdelaziz.project1.R;
import com.example.mohamedabdelaziz.project1.Report.ReportActivity;
import com.example.mohamedabdelaziz.project1.SecondFragment.Model.NewAddDialog;
import com.example.mohamedabdelaziz.project1.SecondFragment.Model.Recycler1Adapter;
import com.example.mohamedabdelaziz.project1.SecondFragment.Model.Recycler2Adapter;
import com.joaquimley.faboptions.FabOptions;

/**
 * Created by Mohamed Abd Elaziz on 10/14/2017.
 */

public class SecondFragment extends Fragment {
    private RecyclerView mRecyclerView_company;
    private RecyclerView mRecyclerView_projects;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, null);
        mRecyclerView_company = (RecyclerView) view.findViewById(R.id.card1_recyclerview);
        mRecyclerView_company.setLayoutManager(new GridLayoutManager(getContext(), 1));
        mRecyclerView_company.setHasFixedSize(false);
        mRecyclerView_company.setAdapter(new Recycler1Adapter());
        mRecyclerView_projects = (RecyclerView) view.findViewById(R.id.card2_recyclerview);
        mRecyclerView_projects.setLayoutManager(new GridLayoutManager(getContext(), 1));
        mRecyclerView_projects.setHasFixedSize(false);
        mRecyclerView_projects.setAdapter(new Recycler2Adapter());
        FabOptions fabOptions = (FabOptions) view.findViewById(R.id.fab_options);
        fabOptions.setButtonsMenu(R.menu.menu_main);
        fabOptions.setFabColor(R.color.colorAccent);
        view.findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NewAddDialog.class));
            }
        });
        view.findViewById(R.id.detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ReportActivity.class));
            }
        });
        return view;

    }

}
