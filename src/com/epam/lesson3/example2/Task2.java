package com.epam.lesson3.example2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit -->");
        int digit = sc.nextInt();
        switch (digit) {
            default:
                System.out.println("Invalid!");
                break;
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}
