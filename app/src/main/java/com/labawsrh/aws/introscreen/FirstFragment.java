package com.labawsrh.aws.introscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;


public class FirstFragment extends Fragment {



    public FirstFragment() {
        // Required empty public constructor
    }

    EasySlider  easySlider;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View componentFrag = inflater.inflate(R.layout.fragment_first, container, false);

        easySlider= componentFrag.findViewById(R.id.SliderId);

        List<SliderItem> easySliders = new ArrayList<>();

        easySliders.add(new SliderItem("slider1",R.drawable.slider1));
        easySliders.add(new SliderItem("slider2",R.drawable.slider2));
        easySliders.add(new SliderItem("slider3",R.drawable.slider3));

        easySlider.setPages(easySliders);


        return componentFrag;
    }
}