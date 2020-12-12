package com.example.passio.member;

public class BeanCard {
    int image;
    String langName,hansudung;
    public BeanCard() {
    }

    public BeanCard(int image, String langName,String hansudung) {
        this.image = image;
        this.langName=langName;
        this.hansudung = hansudung;
    }

    public int getImage() {
        return image;
    }


    public void setImage(int image) {
        this.image = image;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getHansudung() {
        return hansudung;
    }

    public void setHansudung(String hansudung) {
        this.hansudung = hansudung;
    }


}