package com.string.calculator;

public class StringCalculator {

    public static int add(String text) {
        if (text.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",";

            String numList[] = splitNumbers(text, delimiter + "|\n");
            return sum(numList);
        }
    }

    public static int toInt(String number){
        return Integer.parseInt(number);
    }
    public static String[] splitNumbers(String numbers,String divider){
        return numbers.split(divider);
    }

    private static int sum(String[] numbers) {
        int total = 0;
        String tempString = "";
        for (String number:numbers){
                tempString = tempString + ("," + number);
            total += toInt(number);
        }

        return total;
    }
}
