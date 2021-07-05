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
import android.widget.ImageView;
import android.widget.TextView;
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
import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;


public class FirstFragment extends Fragment {
    EasySlider easySlider;
    private Button btnlink;
    private String url,url2;
    ImageView imageView;
    PhotoViewAttacher photoViewAttacher;
    TextView correo;
    private Object PhotoViewAttacher;

    public FirstFragment() {


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View componentFrag = inflater.inflate(R.layout.fragment_first, container, false);

        easySlider= componentFrag.findViewById(R.id.slider1);
        List<SliderItem> easySliders = new ArrayList<>();
        easySliders.add(new SliderItem("ITSE",R.drawable.slider1));
        easySliders.add(new SliderItem("Cambios Internacionales",R.drawable.slider2));
        easySliders.add(new SliderItem("ITSE",R.drawable.slider3));

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


        imageView = (ImageView) componentFrag.findViewById(R.id.portada);
        photoViewAttacher = new PhotoViewAttacher(imageView);

        correo = componentFrag.findViewById(R.id.correo);
        url2="https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=jcrivera@itsescarcega.edu.mx";

                correo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri2 = Uri.parse(url2);
                        Intent intent2 = new Intent(Intent.ACTION_VIEW,uri2);
                        startActivity(intent2);
                    }
                });



        return componentFrag;
    }
}

