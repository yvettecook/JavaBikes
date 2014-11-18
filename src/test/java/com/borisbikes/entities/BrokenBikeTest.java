package com.borisbikes.entities;

import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


/**
 * Created by yvettecook on 18/11/2014.
 */
public class BrokenBikeTest {

    @Test public void
    isBroken() {
        BrokenBike bike = new BrokenBike(new WorkingBike());
        assertTrue(bike.isBroken());
    }

    @Test public void
    canBeRepaired() {
        WorkingBike bike = new WorkingBike();
        BrokenBike broken = new BrokenBike(bike);
        assertEquals(bike, broken.repair());
    }


}
