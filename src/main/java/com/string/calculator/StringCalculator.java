package com.string.calculator;

public class StringCalculator {

    public static int add(String text) {
        if (text.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(text);
        }
    }
}
