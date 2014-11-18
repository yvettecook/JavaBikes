package com.borisbikes.entities;

/**
 * Created by yvettecook on 18/11/2014.
 */
public abstract class AbstractBike {

    AbstractBike bike;

    public boolean isBroken() {
        return this instanceof BrokenBike;
    }

    ;

    public AbstractBike smash() {
        return new BrokenBike(this);
    }

    ;

    public AbstractBike repair() {
        return bike;
    }

    public abstract void ride() throws Exception;
}



