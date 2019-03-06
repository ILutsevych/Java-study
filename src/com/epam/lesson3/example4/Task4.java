package com.epam.lesson3.example4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ->");
        int number = sc.nextInt();

        final int TEN = 10;
        number = number < 0 ? -number : number;
        int sum = 0;
        while (number > 0) {
            int temp = number % TEN;
            sum += temp * temp;
            number /= TEN;

        }
        System.out.println("Sum digits = " + sum);
    }
}
