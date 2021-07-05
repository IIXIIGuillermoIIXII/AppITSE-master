package com.labawsrh.aws.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /*cruze de ventana en 2 segundos*/
                Intent ventana = new Intent(MainActivity.this,menu.class);
                startActivity(ventana);

                finish();
            }
        },500);



    }
}
