package com.example.mohamedabdelaziz.project1.HomePage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mohamedabdelaziz.project1.R;

/**
 * Created by Mohamed Abd Elaziz on 10/13/2017.
 */

public class MainFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.main_fragment,null);
        return rootView ;
    }
}
