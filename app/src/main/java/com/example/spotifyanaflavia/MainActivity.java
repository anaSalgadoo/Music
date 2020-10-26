package com.example.spotifyanaflavia;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView ivMusic;
    Button btnPlay;
    MediaPlayer mediaPlayer;
    TextView aux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivMusic = (ImageView) findViewById(R.id.ivMusic);
        Glide.with(this).load("https://i.ytimg.com/vi/Z9Di4wMDg4Y/maxresdefault.jpg").into(ivMusic);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.paredao);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }
}