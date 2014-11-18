package com.borisbikes.entities;

/**
 * Created by yvettecook on 18/11/2014.
 */
public class WorkingBike extends AbstractBike {

    private boolean riding = false;

    @Override
    public void ride() {
        riding = true;
    }

    public boolean moving() {
        return true;
    }
}
