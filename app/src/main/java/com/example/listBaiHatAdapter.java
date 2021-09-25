package com.example;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animation_nguyenngoctri.R;

import java.util.LinkedList;

public class listBaiHatAdapter extends RecyclerView.Adapter<listBaiHatAdapter.Holder> {

    private LinkedList<Singer> singers;
    private LayoutInflater inflater;
    private Context context;
    private Activity activity;

    public listBaiHatAdapter(LinkedList<Singer> singers, Context context, Activity activity) {
        this.singers = singers;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.activity = activity;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rvbaihat, parent, false);
        return new Holder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Singer singer = singers.get(position);
        holder.tvNameSinger.setText(singer.getNameSinger());
        holder.tvNamSong.setText(singer.getNameSong());
        holder.img.setImageResource(singer.getImg());
    }

    @Override
    public int getItemCount() {
        return singers.size();
    }

    public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private listBaiHatAdapter adapter;
        ImageView img;
        TextView tvNamSong, tvNameSinger;

        public Holder(@NonNull View itemView, listBaiHatAdapter listBaiHatAdapter) {
            super(itemView);

            tvNamSong = itemView.findViewById(R.id.tvTenBaiHat);
            tvNameSinger = itemView.findViewById(R.id.tvTenCaSi);
            img = itemView.findViewById(R.id.imgAvatar);

            this.adapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, Screen01.class);
            Singer singer = singers.get(getLayoutPosition());

            Bundle bundle = new Bundle();
            bundle.putSerializable("SINGER", singer);
            intent.putExtra("DATA", bundle);

            context.startActivity(intent);

            activity.overridePendingTransition(R.anim.enter_x, R.anim.exit_x);

        }
    }
}
