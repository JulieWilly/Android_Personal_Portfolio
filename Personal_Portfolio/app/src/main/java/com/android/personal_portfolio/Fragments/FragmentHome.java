package com.android.personal_portfolio.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.personal_portfolio.Adapters.Projects;
import com.android.personal_portfolio.Adapters.ProjectsAdapter;
import com.android.personal_portfolio.R;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    ProjectsAdapter adapter;
    ArrayList<Projects> projects = new ArrayList<>();
    private String[] projectDesc;
    private String[] projectSubTitles;
    private String[] projectTitles;
    private int[] imageResourceID;
    private String[] projectViews;
    private String[] projectViewers;
    private int[] projectViewResourceId;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

        // method to call the data to be initialized.
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /**
         * method called when the fragment view hierachy have been
         * created and is ready for you to interact with
         */

        // initialize the method that will call the data.
        dataInitialize();

        // find the recycler view to inflate
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        adapter = new ProjectsAdapter(getContext(), projects);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

    private void dataInitialize() {
        /**
         * In this section you will get the string details of the project here.
         */
        projects = new ArrayList<>();

        projectTitles = new String[] {
                // calling the project title names here.
                getString(R.string.tle_brick_breaker),
                getString(R.string.tle_calculator),
                getString(R.string.tle_food_ordering),
                getString(R.string.tle_login_register),
                getString(R.string.tle_music_app),
                getString(R.string.tle_quiz_app),
                getString(R.string.tle_weather),
                //getString(R.string.tle_tic_tack_toe),
        };

        // sub titles
        projectSubTitles = new String[] {
                getString(R.string.brick_Breaker_game),
                getString(R.string.calculator),
                getString(R.string.city_Music_Player),
                getString(R.string.foodator),
                getString(R.string.login_register_app),
                getString(R.string.weather_app),
                getString(R.string.quiz_app),
//                getString(R.string.tic_tac_toe),
        };
        // project description

        projectDesc = new String[] {
                getString(R.string.desc),
                getString(R.string.desc),
                getString(R.string.desc),
                getString(R.string.desc),
                getString(R.string.desc),
                getString(R.string.desc),
                getString(R.string.desc)
        };

        // image resources.

        imageResourceID = new int[] {
                R.drawable.pic1,
                R.drawable.pic2,
                R.drawable.pic3,
                R.drawable.pic4,
                R.drawable.pic5,
                R.drawable.pic6,
                R.drawable.pic7
        };

        projectViews = new String[] {
                getString(R.string.projectViews),
                getString(R.string.projectViews),
                getString(R.string.projectViews),
                getString(R.string.projectViews),
                getString(R.string.projectViews),
                getString(R.string.projectViews),
                getString(R.string.projectViews)
        };

        projectViewers = new String[] {
                getString(R.string.k),
                getString(R.string.k),
                getString(R.string.k),
                getString(R.string.k),
                getString(R.string.k),
                getString(R.string.k),
                getString(R.string.k)
        };

        projectViewResourceId = new int[] {
                R.drawable.eyeview,
                R.drawable.eyeview,
                R.drawable.eyeview,
                R.drawable.eyeview,
                R.drawable.eyeview,
                R.drawable.eyeview,
                R.drawable.eyeview,

        };

        // loop through the data for display and arrangement.
        for (int i = 0; i < projectTitles.length;i++) {
            Projects projects1 = new Projects(projectTitles[i],projectSubTitles[i],projectDesc[i],imageResourceID[i], projectViews[i], projectViewers[i], projectViewResourceId[i]);
            projects.add(projects1);
        }
    }
}