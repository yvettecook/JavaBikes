package com.borisbikes.entities;

/**
 * Created by yvettecook on 18/11/2014.
 */
public class WorkingBike extends Bike {

    public Bike smash() {
        return new BrokenBike(this);
    }

    @Override
    public boolean isBroken() {
        return false;
    }
}
