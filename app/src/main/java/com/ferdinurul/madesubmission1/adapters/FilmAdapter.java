package com.ferdinurul.madesubmission1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ferdinurul.madesubmission1.R;
import com.ferdinurul.madesubmission1.models.FilmModel;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.viewHolder> {
    private Context context;

    private ArrayList<FilmModel> mArrayListData;
    public FilmAdapter(Context context, ArrayList<FilmModel> mArrayList) {
        this.context = context;
        this.mArrayListData = mArrayList;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_film, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(final viewHolder viewHolder, int i) {
        FilmModel modelData = mArrayListData.get(i);
        viewHolder.tv_judul.setText(modelData.getJudul_film());
        viewHolder.tv_tahun.setText(modelData.getTahun());
        viewHolder.tv_deskripsi.setText(modelData.getDeskripsi());
        viewHolder.tv_deskripsi_singkat.setText(modelData.getDeskripsi_singkat());
        Glide.with(viewHolder.itemView.getContext())
                .load(modelData.getPoster())
                .placeholder(R.drawable.ic_launcher_background)
                .into(viewHolder.iv_poster);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(mArrayListData.get(viewHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArrayListData.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView iv_poster;
        TextView tv_judul, tv_tahun, tv_deskripsi, tv_deskripsi_singkat;

        public viewHolder(View itemView) {
            super(itemView);
            iv_poster = itemView.findViewById(R.id.iv_poster);
            tv_judul = itemView.findViewById(R.id.tv_judul);
            tv_tahun = itemView.findViewById(R.id.tv_tahun);
            tv_deskripsi = itemView.findViewById(R.id.tv_deskripsi);
            tv_deskripsi_singkat = itemView.findViewById(R.id.tv_deskripsi_singkat);
        }

    }

    public interface OnItemClickCallback {
        void onItemClicked(FilmModel data);
    }
}
