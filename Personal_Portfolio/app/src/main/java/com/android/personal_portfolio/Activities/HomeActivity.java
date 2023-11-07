package com.android.personal_portfolio.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;

import com.android.personal_portfolio.Adapters.AdapterViewPager;
import com.android.personal_portfolio.Fragments.FragmentHome;
import com.android.personal_portfolio.Fragments.FragmentInterests;
import com.android.personal_portfolio.Fragments.FragmentProfile;
import com.android.personal_portfolio.Fragments.FragmentProjects;
import com.android.personal_portfolio.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ScrollView scrollView;

    BottomNavigationView bottomNav;
    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNav = findViewById(R.id.bottomNav);

        fragmentArrayList.add(new FragmentHome());
        fragmentArrayList.add(new FragmentInterests());
        fragmentArrayList.add(new FragmentProjects());
        fragmentArrayList.add(new FragmentProfile());

        //replaceFragment(new FragmentHome());
        // set the fragments view to the scrollView
        AdapterViewPager adapterViewPager = new AdapterViewPager(this, fragmentArrayList);

        // bottom nav listener
        bottomNav.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        // code to always open the home fragment when the app opens
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentHome()).commit();

    }
/**
    private void replaceFragment(Fragment fragment) {
        // methods to replace the fragments.
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
*/
    //    method for switching between the fragments.
 private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
       public boolean onNavigationItemSelected(@NonNull MenuItem item) {Fragment selectedFragment = null;

            // navigate between the fragments.
            switch (item.getItemId()) {
                case R.id.home:
                    selectedFragment = new FragmentHome();
                    break;
                case R.id.interests:
                    selectedFragment = new FragmentInterests();
                    break;
                case R.id.projects:
                    selectedFragment = new FragmentProjects();
                    break;
                case R.id.settings:
                    selectedFragment = new FragmentProfile();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, selectedFragment).commit();

            return true;
        }
    };
}
