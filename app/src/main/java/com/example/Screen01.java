package com.example;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animation_nguyenngoctri.R;

public class Screen01 extends AppCompatActivity {

    private ImageView img_taylor;
    private ImageView img_music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen01);

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