package edu.chalmers.tda593.hotelcalifornia;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testIsTrue() throws Exception {

        Example e = new Example();

        assertTrue("True should be true", e.isTrue(true));
        assertFalse("False should be false", e.isTrue(false));
    }
}