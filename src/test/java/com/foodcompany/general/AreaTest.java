package com.foodcompany.general;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class AreaTest {

    private AreaCalculator ac;

    @Before
    public void setUp()
    {
        ac = new AreaCalculator();
    }

    @Test
    public void test_calculateAreaOfCircle()
    {
        Double result = ac.calculateAreaOfCircle(7.8);
        assertEquals(Double.valueOf(191.0376),result);
    }

    @Test
    public void test_calculateAreaOfRectangle()
    {
        Integer result = ac.calculateAreaOfRectangle(2,3);
        assertEquals(Integer.valueOf(6),result);
    }

    @Test
    public void test_calculateAreaOfSquare()
    {
        Integer result = ac.calculateAreaOfSquare(4);
        assertEquals(Integer.valueOf(16),result);
    }


}
