package com.ferdinurul.madesubmission1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class FilmModel implements Parcelable {
    private String judul_film;

    private String tahun;

    private String deskripsi;

    private String deskripsi_singkat;

    private int poster;

    public String getJudul_film() {
        return judul_film;
    }

    public void setJudul_film(String judul_film) {
        this.judul_film = judul_film;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi_singkat() {
        return deskripsi_singkat;
    }

    public void setDeskripsi_singkat(String deskripsi_singkat) {
        this.deskripsi_singkat = deskripsi_singkat;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public FilmModel(Parcel parcel) {
        judul_film = parcel.readString();
        tahun = parcel.readString();
        deskripsi = parcel.readString();
        deskripsi_singkat = parcel.readString();
        poster = parcel.readInt();
    }
    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(judul_film);
        parcel.writeString(tahun);
        parcel.writeString(deskripsi);
        parcel.writeString(deskripsi_singkat);
        parcel.writeInt(poster);
    }
    @Override
    public int describeContents() {
        return 0;
    }
    public static final Parcelable.Creator<FilmModel> CREATOR = new Parcelable.Creator<FilmModel>() {
        @Override
        public FilmModel createFromParcel(Parcel parcel) {
            return new FilmModel(parcel);
        }
        @Override
        public FilmModel[] newArray(int size) {
            return new FilmModel[size];
        }
    };
}
