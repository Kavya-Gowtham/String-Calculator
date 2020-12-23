package com.string.calculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testEmptyString(){
        assertEquals(0,StringCalculator.add(""));
    }

    @Test
    public void testOneNumber(){
        assertEquals(1,StringCalculator.add("1"));
    }
}
