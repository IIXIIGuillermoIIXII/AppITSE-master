package com.labawsrh.aws.introscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class menu extends AppCompatActivity {

    FirstFragment FRAG1 = new FirstFragment();
    SecondFrament FRAG2 = new SecondFrament();
    ThridFragment FRAG3 = new ThridFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView navigationView = findViewById(R.id.bottomNavigationView);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(FRAG1);

    }

    private  final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem Item) {

            switch (Item.getItemId()){

                case R.id.firstFragment:
                    loadFragment(FRAG1);
                    return  true;
                case R.id.secondFrament:
                    loadFragment(FRAG2);
                    return true;
                case R.id.thridFragment:Fragment:
                    loadFragment(FRAG3);
                    return  true;

            }
            return false;
        }
    };


    public  void loadFragment (Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerView,fragment);
        transaction.commit();


    }



}






