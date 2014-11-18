package com.borisbikes.entities;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


/**
 * Created by yvettecook on 18/11/2014.
 */
public class BrokenBikeTest {

    BrokenBike bike;

    @Before
    public void setUp() {
        bike = new BrokenBike(new WorkingBike());
    }

    @Test public void
    isBroken() {

        assertTrue(bike.isBroken());
    }

    @Test public void
    canBeRepaired() {
        WorkingBike workingBike = new WorkingBike();
        BrokenBike broken = new BrokenBike(workingBike);
        assertEquals(workingBike, broken.repair());
    }

    @Test(expected = Exception.class)
    public void
    canNotBeRidden() throws Exception {
        bike.ride();
    }
}
