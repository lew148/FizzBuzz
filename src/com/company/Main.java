package com.company;

public class Main {

    public static void main(String[] args) {


        for (Integer i = 1; i <= 300; i++) {
            String result = "";

            if (i % 3 == 0) {
                result = result + "Fizz";
            }

            if (i % 13 == 0) {
                result = result + "Fezz";
            }

            if (i % 5 == 0) {
                result = result + "Buzz";
            }

            if (i % 7 == 0) {
                result = result + "Bang";
            }

            if (i % 11 == 0) {
                result = result + "Bong";
            }




            if (result == "") {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}