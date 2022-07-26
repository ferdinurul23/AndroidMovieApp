package com.ferdinurul.madesubmission1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ferdinurul.madesubmission1.R;

public class DetailFilmActivity extends AppCompatActivity {

    TextView tv_judul, tv_tahun, tv_deskripsi;
    ImageView iv_poster;

    String judul_film, tahun, deskripsi;
    int poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_film);

        getSupportActionBar().setTitle(R.string.detail_title);

        judul_film = getIntent().getStringExtra("judul_film");
        tahun = getIntent().getStringExtra("tahun");
        deskripsi = getIntent().getStringExtra("deskripsi");
        poster = getIntent().getIntExtra("poster", 0);

        tv_judul = findViewById(R.id.tv_judul);
        tv_tahun = findViewById(R.id.tv_tahun);
        tv_deskripsi = findViewById(R.id.tv_deskripsi);
        iv_poster = findViewById(R.id.iv_poster);

        tv_judul.setText(judul_film);
        tv_tahun.setText(tahun);
        tv_deskripsi.setText(deskripsi);
        Glide.with(DetailFilmActivity.this)
                .load(poster)
                .placeholder(R.drawable.ic_launcher_background)
                .into(iv_poster);
    }
}
