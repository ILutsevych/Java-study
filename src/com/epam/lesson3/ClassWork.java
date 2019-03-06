package com.epam.lesson3;

public class ClassWork {

    public static void main (String[] args){

        int a = -10;
        int b = 5;
        int c = 0;

        if (a > b && a > c) {
            System.out.println("Max = " + a);
        }else if (b > a && b > c) {
            System.out.println("Max = " + b);
        } else {
            System.out.println("Max = " + c);
        }

        int maxValue = a > b ? a : b;
        maxValue = maxValue > c ? maxValue : c;
        System.out.println("Maxvalue = " + maxValue);
    }

}
