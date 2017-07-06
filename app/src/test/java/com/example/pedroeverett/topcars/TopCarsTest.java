package com.example.pedroeverett.topcars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pedroeverett on 05/07/2017.
 */

public class TopCarsTest {

    @Test
    public void getListTest() {
        TopCars topCars = new TopCars();
        assertEquals(10, topCars.getList().size());
    }
}
