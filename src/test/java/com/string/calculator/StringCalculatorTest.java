package com.string.calculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void addEmptyString(){
        assertEquals(0,StringCalculator.add(""));
    }
}
