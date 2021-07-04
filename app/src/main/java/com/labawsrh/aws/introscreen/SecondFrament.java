package com.labawsrh.aws.introscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class SecondFrament extends Fragment {



    public SecondFrament() {
        // Required empty public constructor
    }




    GridView gridViewImagenes;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View componentFragment = inflater.inflate(R.layout.fragment_second, container, false);
       gridViewImagenes = componentFragment.findViewById(R.id.grid_view);
       gridViewImagenes.setAdapter(new GaleriaAdapter(getContext()));

       gridViewImagenes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Intent intent = new Intent(getContext(), FullScreen.class);
               intent.putExtra("idimagen",i);
               startActivity(intent);

           }
       });

        return componentFragment;
    }
}