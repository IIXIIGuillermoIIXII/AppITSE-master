package com.labawsrh.aws.introscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondFrament extends Fragment {



    public SecondFrament() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View componentFragment = inflater.inflate(R.layout.fragment_second, container, false);




        return componentFragment;
    }
}