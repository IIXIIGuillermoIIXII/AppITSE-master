package com.labawsrh.aws.introscreen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class ThridFragment extends Fragment {



    public ThridFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View componentFragment = inflater.inflate(R.layout.fragment_thrid, container, false);

        YouTubePlayerView youTubePlayerView = componentFragment.findViewById(R.id.youtube_player_view1);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "lxoqZDFxbsE";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView1 = componentFragment.findViewById(R.id.youtube_player_view2);
        getLifecycle().addObserver(youTubePlayerView1);

        youTubePlayerView1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "cdnt5-qsRV8";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView2 = componentFragment.findViewById(R.id.youtube_player_view3);
        getLifecycle().addObserver(youTubePlayerView2);

        youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "dAHoQq9iWsk";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView5 = componentFragment.findViewById(R.id.youtube_player_view5);
        getLifecycle().addObserver(youTubePlayerView5);

        youTubePlayerView5.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "JpxXXwHIUIg";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        return componentFragment;
    }
}