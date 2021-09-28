package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animation_nguyenngoctri.R;

import java.util.LinkedList;

public class Screen1 extends AppCompatActivity {

    RecyclerView rv_Baihat;
    listBaiHatAdapter adapter;
    LinkedList<Singer> singers = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        rv_Baihat = findViewById(R.id.rvBaiHat);

        singers.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));
        singers.add(new Singer("The Kid LAROI, Justin Bieber", "STAY", R.drawable.stay));
        singers.add(new Singer("Sơn Tùng M-TP", "Hãy trao cho anh", R.drawable.mtp));
        singers.add(new Singer("ROSÉ", "On The Ground", R.drawable.roses));
        singers.add(new Singer("Post Malone", "Congratulations", R.drawable.post));

        adapter = new listBaiHatAdapter(singers, this, this);
        rv_Baihat.setAdapter(adapter);
        rv_Baihat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}