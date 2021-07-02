package com.labawsrh.aws.introscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;



public class FirstFragment extends Fragment {
    EasySlider easySlider;
    private Button btnlink;
    private String url;

    public FirstFragment() {


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View componentFrag = inflater.inflate(R.layout.fragment_first, container, false);

        easySlider= componentFrag.findViewById(R.id.slider1);
        List<SliderItem> easySliders = new ArrayList<>();
        easySliders.add(new SliderItem("ITEM1",R.drawable.slider1));
        easySliders.add(new SliderItem("ITEM2",R.drawable.slider2));
        easySliders.add(new SliderItem("ITEM3",R.drawable.slider3));

        easySlider.setTimer(1000);

        easySlider.setPages(easySliders);


        YouTubePlayerView youTubePlayerView2 = componentFrag.findViewById(R.id.youtube_player_view1);
        getLifecycle().addObserver(youTubePlayerView2);

        youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "_NVEP93UfaI";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        btnlink = componentFrag.findViewById(R.id.buttom1);
        url="https://drive.google.com/open?id=1-qokWUfZ5TwVO9QYOXYKNH9xsGKQf-Jw";

        btnlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });





        return componentFrag;
    }
}