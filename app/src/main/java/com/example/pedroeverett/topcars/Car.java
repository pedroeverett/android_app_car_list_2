package com.example.pedroeverett.topcars;

import android.net.Uri;

/**
 * Created by pedroeverett on 05/07/2017.
 */

public class Car {

    private int ranking;
    private String brand;
    private String model;
    private Uri image;


    public Car(Integer ranking, String brand, String model, Uri image) {
        this.ranking = ranking;
        this.brand = brand;
        this.model = model;
        this.image = image;


    }

    public Integer getRanking() {
        return ranking;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Uri getImage() {
        return image;
    }

}



