package com.ferdinurul.madesubmission1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.ferdinurul.madesubmission1.R;
import com.ferdinurul.madesubmission1.adapters.FilmAdapter;
import com.ferdinurul.madesubmission1.models.FilmData;
import com.ferdinurul.madesubmission1.models.FilmModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<FilmModel> mArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(R.string.katalog_title);

        recyclerView = findViewById(R.id.rv_film);
        recyclerView.setHasFixedSize(true);

        mArrayList.addAll(FilmData.getDataList());

        showListData();
    }

    private void showListData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FilmAdapter filmAdapter = new FilmAdapter(getApplicationContext(), mArrayList);
        recyclerView.setAdapter(filmAdapter);

        filmAdapter.setOnItemClickCallback(new FilmAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(FilmModel data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(FilmModel data) {
        String judul_film = data.getJudul_film();
        String tahun = data.getTahun();
        String deskripsi = data.getDeskripsi();
        String deskripsi_singkat = data.getDeskripsi_singkat();
        int poster = data.getPoster();

        Intent intent = new Intent(this, DetailFilmActivity.class);
        intent.putExtra("judul_film", judul_film);
        intent.putExtra("tahun", tahun);
        intent.putExtra("poster", poster);
        intent.putExtra("deskripsi_singkat", deskripsi_singkat);
        intent.putExtra("deskripsi", deskripsi);
        this.startActivity(intent);
    }
}
