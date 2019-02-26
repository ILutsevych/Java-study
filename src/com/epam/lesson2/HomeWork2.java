package com.epam.lesson2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main (String[] args){
        taskOne();
        taskTwo();
        taskThree();
        taskFour();

    }

    public static void taskOne(){
        System.out.println("Task 1");
        int a = 15;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public static void taskTwo(){
        System.out.println("\nTask 2 ");
        int a = 123;
        String b = Integer.toString(a);

        String b1 = String.valueOf(b.charAt(0));
        String b2 = String.valueOf(b.charAt(1));
        String b3 = String.valueOf(b.charAt(2));
        String c = b3 + b2 + b1;

        int e = Integer.parseInt(c);
        int result = a - e;
        System.out.println("Result: " + a + " - " + e + " = " + result);
    }

    public static void taskThree(){
        System.out.println("\nTask 3 ");

        double gram = 453.6;

        System.out.print("Enter pounds ->");
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();

        double kilo = pounds * gram / 1000;
        String k = Double.toString(kilo);
        String kg = k.substring(0, k.indexOf('.'));
        String g = k.substring(k.indexOf('.') + 1);

        System.out.println(k);
        System.out.println("Result: " + kg + "kg " + g + "g");


    }
    public static void taskFour(){
        System.out.println("\nTask 4 ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Depo amount ->");
        int sumdepo = scanner.nextInt();
        System.out.print("Enter month ->");
        int month = scanner.nextInt();
        System.out.print("Enter percent ->");
        float percent = scanner.nextFloat();

        float profit = (sumdepo * percent / 100 * month * 30)/ 365;

        System.out.println("Depo profit for " + month + " month "+ "is " + profit + " hrn");
    }
}
