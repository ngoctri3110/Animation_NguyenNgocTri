package com.example.animation_nguyenngoctri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class Ex2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        final ImageView img4 = findViewById(R.id.imgTree4);

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ex2.this,
                        Ex3.class);

                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Ex2.this, img4,
                                ViewCompat.getTransitionName(img4));
                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });

        final ImageView img1 = findViewById(R.id.imgTree1);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ex2.this,
                        Ex4.class);

                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Ex2.this, img1,
                                ViewCompat.getTransitionName(img1));
                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });

    }
}