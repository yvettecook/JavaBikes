package com.borisbikes.entities;

/**
 * Created by yvettecook on 18/11/2014.
 */
public abstract class Bike {

    Bike bike;

    public abstract boolean isBroken();

    public Bike smash() {
        return new BrokenBike(this);
    };

    public Bike repair() {
        return bike;
    }
}
