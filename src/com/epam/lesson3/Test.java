package com.epam.lesson3;

public class Test {

    public static void main(String[] args) {

        int a = 467 % 10;
//
        int dicker = (467 - a) / 10 % 10;
        int hundred = (467 - (dicker * 10 - a)) / 100;
        int f = a * 100 + dicker * 10 + hundred;

        System.out.println("123 % 10 = " + a);

        System.out.println(dicker);
        System.out.println(hundred);
        System.out.println(f);
    }
}
