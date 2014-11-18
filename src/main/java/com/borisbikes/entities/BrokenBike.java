package com.borisbikes.entities;

/**
 * Created by yvettecook on 18/11/2014.
 */
public class BrokenBike extends Bike{

    public BrokenBike(Bike bike) {
        this.bike = bike;
    }

    public boolean isBroken() {
        return true;
    }


}
