package com.borisbikes.entities;

/**
 * Created by yvettecook on 18/11/2014.
 */
public class BrokenBike extends Bike{
    Bike workingBike;

    public BrokenBike(WorkingBike bike) {
        workingBike = bike;
    }

    public boolean isBroken() {
        return true;
    }

    public Bike repair() {
        return workingBike;
    }
}
