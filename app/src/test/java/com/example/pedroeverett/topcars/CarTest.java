package com.example.pedroeverett.topcars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pedroeverett on 05/07/2017.
 */


public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car(101, "Range Rover", "Sport");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)101, car.getRanking());

    }

    @Test
    public void getBrandTest() {
        assertEquals("Range Rover", car.getBrand());

    }

    @Test
    public void getYearTest() {
        assertEquals("Sport", car.getModel());

    }
}