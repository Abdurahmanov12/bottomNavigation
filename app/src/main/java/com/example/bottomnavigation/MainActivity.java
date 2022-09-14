package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bottomnavigation.ui.Fragment.AddFragment;
import com.example.bottomnavigation.ui.Fragment.HomeFragment;
import com.example.bottomnavigation.ui.Fragment.LocationFragment;
import com.example.bottomnavigation.ui.Fragment.MenuFragment;
import com.example.bottomnavigation.ui.Fragment.ToggleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    FloatingActionButton fab;
    HomeFragment homeFragment = new HomeFragment();
    LocationFragment locationFragment = new LocationFragment();
    AddFragment addFragment = new AddFragment();
    MenuFragment menuFragment = new MenuFragment();
    ToggleFragment toggleFragment = new ToggleFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, addFragment).commit());

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(item -> {
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
                    menuFragment.show(getSupportFragmentManager(),"BottomSheetDialog"
                            );
                    return true;
            }
            return false;
        });
    }
}