package com.example.pedroeverett.topcars;

import java.util.ArrayList;

/**
 * Created by pedroeverett on 05/07/2017.
 */


public class TopCars {

    private ArrayList<Car> list;

    public TopCars() {
        list = new ArrayList<Car>();
        list.add(new Car(1, "Land Rover", "Discovery", "@drawable/landrover_discovery.jpg"));
        list.add(new Car(2, "BMW", "5 Series"));
        list.add(new Car(3, "Honda", "Civic"));
        list.add(new Car(4, "Nissan", "Micra"));
        list.add(new Car(5, "Peugeot", "5008"));
        list.add(new Car(6, "Ford", "Fiesta"));
        list.add(new Car(7, "Toyota", "C-HR"));
        list.add(new Car(8, "Citroen", "C3"));
        list.add(new Car(9, "Skoda", "Kodiaq"));
        list.add(new Car(10, "Audi", "Q5"));
    }

    public ArrayList<Car> getList() {
        return new ArrayList<Car>(list);
    }

}
