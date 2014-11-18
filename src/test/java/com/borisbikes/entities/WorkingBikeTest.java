package com.borisbikes.entities;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by yvettecook on 18/11/2014.
 */
public class WorkingBikeTest {

    WorkingBike bike;

    @Before
    public void setUp() {
        bike = new WorkingBike();
    }

    @Test public void
        isNotBroken() {
            assertFalse(bike.isBroken());
    }

    @Test public void
        canBreak() {
            assertTrue(bike.smash().isBroken());
    }

    @Test public void
        canBeBrokenMoreTimes() {
            assertFalse(bike.smash().smash().repair().repair().isBroken());
    }

    @Test public void
        canBeRidden() {
            bike.ride();
            assertTrue(bike.moving());
    }


}
