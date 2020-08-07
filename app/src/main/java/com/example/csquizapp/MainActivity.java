package com.example.csquizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout layout_drawer;
    private Toolbar toolbar_ActionBar;
    private NavigationView navview_Navigation;
    private FragmentContainerView frag_Container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_drawer=findViewById(R.id.layout_Drawer);
        toolbar_ActionBar=findViewById(R.id.toolbar_ActionBar);
        navview_Navigation=findViewById(R.id.navview_Navigation);
        frag_Container=findViewById(R.id.frag_Container);

        setSupportActionBar(toolbar_ActionBar);

        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,layout_drawer,R.string.opendrawer,R.string.closedrawer);
        layout_drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navview_Navigation.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                layout_drawer.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}