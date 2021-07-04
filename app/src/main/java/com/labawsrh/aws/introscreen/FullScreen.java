package com.labawsrh.aws.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreen extends AppCompatActivity {


    ImageView imageViewDetalle;
    GaleriaAdapter galeriaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageViewDetalle = findViewById(R.id.image_detalle);

        Intent i = getIntent();
        int posicion = i.getExtras().getInt("idimagen");

        galeriaAdapter = new GaleriaAdapter(this);
        imageViewDetalle.setImageResource(galeriaAdapter.imagenesArray[posicion]);


    }
}