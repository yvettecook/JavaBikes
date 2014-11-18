package com.borisbikes.entities;

/**
 * Created by yvettecook on 18/11/2014.
 */
public class BrokenBike extends AbstractBike {

    public BrokenBike(AbstractBike bike) {
        this.bike = bike;
    }

    @Override
    public void ride() throws Exception{
        throw new Exception();
    }


}
