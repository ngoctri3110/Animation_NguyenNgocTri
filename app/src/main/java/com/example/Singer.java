package com.example;

import java.io.Serializable;

public class Singer implements Serializable {
    private String nameSinger;
    private String nameSong;
    private int img;

    public Singer(String nameSinger, String nameSong, int img) {
        this.nameSinger = nameSinger;
        this.nameSong = nameSong;
        this.img = img;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public String getNameSong() {
        return nameSong;
    }

    public int getImg() {
        return img;
    }
}
