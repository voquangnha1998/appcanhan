package com.example.passio.home;

public class QuanGanToi {
    int img;
    String langName;
    public QuanGanToi() {
    }

    public QuanGanToi(int img, String langName) {
        this.img = img;
        this.langName=langName;
    }

    public QuanGanToi(int img) {
        this.img = img;
    }

    public int getImg() {
        return img;
    }
    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }



}
