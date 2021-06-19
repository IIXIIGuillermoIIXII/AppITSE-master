package com.labawsrh.aws.introscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ahmed.easyslider.EasySlider;


public class FirstFragment extends Fragment {



    public FirstFragment() {
        // Required empty public constructor
    }

    EasySlider easySlider;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View componetFrag = inflater.inflate(R.layout.fragment_first, container, false);

        easySlider= componetFrag.findViewById(R.id.slider1);

        return componetFrag;
    }
}