package com.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animation_nguyenngoctri.R;

public class Screen01 extends AppCompatActivity {

    private ImageView img_taylor;
    private ImageView img_music;

    TextView tvSongSinger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen01);

        img_music = findViewById(R.id.img_music);
        img_taylor = findViewById(R.id.img_taylor);
        tvSongSinger = findViewById(R.id.tvBaiHat);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("DATA");
        Singer singer = (Singer) bundle.getSerializable("SINGER");
        tvSongSinger.setText(singer.getNameSinger() + "-" + singer.getNameSong());
        img_taylor.setImageResource(singer.getImg());

        img_taylor = findViewById(R.id.img_taylor);
        img_music = findViewById(R.id.img_music);
        Animation animation =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anirotate);

        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.aniblink);

        img_taylor.startAnimation(animation);
        img_music.startAnimation(animation1);
    }
}