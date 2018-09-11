package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        for (Integer i = 1; i <= 300; i++) {
            List<String> result = new ArrayList<>();

            if (i % 3 == 0) {
                result.add("Fizz");
            }

            if (i % 13 == 0) {
                result.add("Fezz");
            }

            if (i % 5 == 0) {
                result.add("Buzz");
            }

            if (i % 7 == 0) {
                result.add("Bang");
            }

            if (i % 11 == 0) {
                result.add("Bong");
            }




            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}