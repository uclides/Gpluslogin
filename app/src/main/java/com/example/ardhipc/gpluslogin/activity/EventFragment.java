package com.example.ardhipc.gpluslogin.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ardhipc.gpluslogin.R;

/**
 * Created by Ardhipc on 5/6/2015.
 */
<<<<<<< HEAD:app/src/main/java/com/example/ardhipc/gpluslogin/activity/HomeFragment.java
public class HomeFragment extends Fragment{
    public HomeFragment(){
    Intent i = new Intent();
        i.getStringExtra("email");
=======
public class EventFragment extends Fragment {
    public EventFragment(){
>>>>>>> upstream/master:app/src/main/java/com/example/ardhipc/gpluslogin/activity/EventFragment.java

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
