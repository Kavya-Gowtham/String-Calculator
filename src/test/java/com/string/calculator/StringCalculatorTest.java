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

    @Test
    public void testTwoNumber(){
        assertEquals(3,StringCalculator.add("1,2"));
    }

    @Test
    public void testMultipleNumber(){
        assertEquals(6,StringCalculator.add("1,2,3"));
    }

    @Test
    public void testNewLine(){
        assertEquals(6,StringCalculator.add("1\n2,3"));
    }

    @Test
    public void testOtherDelimiters(){
        assertEquals(3,StringCalculator.add("//;\n1;2"));
    }
}
