package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.bottomnavigation.ui.AddFragment;
import com.example.bottomnavigation.ui.HomeFragment;
import com.example.bottomnavigation.ui.LocationFragment;
import com.example.bottomnavigation.ui.QuestFragment;
import com.example.bottomnavigation.ui.ToggleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    FloatingActionButton fab;
    HomeFragment homeFragment = new HomeFragment();
    LocationFragment locationFragment = new LocationFragment();
    AddFragment addFragment = new AddFragment();
    QuestFragment questFragment = new QuestFragment();
    ToggleFragment toggleFragment = new ToggleFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, addFragment).commit());

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;
                    case R.id.ic_location:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, locationFragment).commit();
                        return true;
                    case R.id.ic_legend_toggle:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, toggleFragment).commit();
                        return true;
                    case R.id.ic_menu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, questFragment).commit();
                        return true;
                }

                return false;
            }
        });
    }
}