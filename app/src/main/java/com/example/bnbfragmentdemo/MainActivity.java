package com.example.bnbfragmentdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bnbfragmentdemo.Fragment.Favorites_Fragment;
import com.example.bnbfragmentdemo.Fragment.Home_Fragment;
import com.example.bnbfragmentdemo.Fragment.Music_Fragment;
import com.example.bnbfragmentdemo.Fragment.Newspaper_Fragment;
import com.example.bnbfragmentdemo.Fragment.Place_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.imHome);

    }

    private void setFragment(Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fcView, fragment)
                .commit();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.imHome:

                setFragment(new Home_Fragment());

                return true;

            case R.id.imFavorite:

                setFragment(new Favorites_Fragment());

                return true;

            case R.id.imMusic:

                setFragment(new Music_Fragment());

                return true;

            case R.id.imPlace:

                setFragment(new Place_Fragment());

                return true;

            case R.id.imNewspaper:

                setFragment(new Newspaper_Fragment());

                return true;

        }

        return false;
    }
}