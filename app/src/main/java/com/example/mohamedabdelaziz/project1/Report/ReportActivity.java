package com.example.mohamedabdelaziz.project1.Report;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.mohamedabdelaziz.project1.R;

public class ReportActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment1Card1(), "").commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.item1) {

            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment1Card1(), "").commit();

        } else if (id == R.id.item2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment2Card1(), "").commit();

        } else if (id == R.id.item3) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment3Card1(), "").commit();
        } else if (id == R.id.item4) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment4Card2(), "").commit();
        } else if (id == R.id.item5) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment5Card3(), "").commit();

        } else if (id == R.id.item6) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment6Card3(), "").commit();
        } else if (id == R.id.item7) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment7Card3(), "").commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
