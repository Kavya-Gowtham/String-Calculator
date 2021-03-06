package com.string.calculator;

public class StringCalculator {

    public static int add(String text) {
        if (text.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",";
            if(text.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(text.charAt(2));
                text = text.substring(4);
            }

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
        for (String number:numbers) {

            if(toInt(number) < 0){
                if(tempString.equals(""))
                    tempString = number;
                else
                    tempString = tempString + ("," + number);
            }
            if (toInt(number) < 1000) {
                total = total + toInt(number);
            }
        }
        return total;
    }
}
