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
        // we are also setting fade
        // animation for exit transition.
        getWindow().setExitTransition(fade);

        final ImageView imageView = findViewById(R.id.imgTree4);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ex2.this,
                        Ex3.class);

                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Ex2.this, imageView,
                                ViewCompat.getTransitionName(imageView));
                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });
    }
}