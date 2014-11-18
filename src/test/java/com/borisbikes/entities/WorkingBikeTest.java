package com.borisbikes.entities;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by yvettecook on 18/11/2014.
 */
public class WorkingBikeTest {

    @Test public void
        isNotBroken() {
        WorkingBike bike = new WorkingBike();
        assertFalse(bike.isBroken());
    }

    @Test public void
        canBreak() {
        WorkingBike bike = new WorkingBike();
        assertTrue(bike.smash().isBroken());
    }

}
