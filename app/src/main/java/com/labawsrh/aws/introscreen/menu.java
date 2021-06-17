package com.labawsrh.aws.introscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class menu extends AppCompatActivity {

    private TextView TEX1;
    private BottomNavigationView ButtomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        ButtomNav = findViewById(R.id.bottomNavigationView);
        ButtomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.firstFragment){

                    YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
                    getLifecycle().addObserver(youTubePlayerView);

                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "S0Q4gqBUs7c";
                            youTubePlayer.loadVideo(videoId, 0);
                        }
                    });

                }else if(menuItem.getItemId() == R.id.secondFrament){



                }else if (menuItem.getItemId() == R.id.thridFragment){


                }


                return true;
            }
        });





    }
}





