package com.epam.lesson5;

import java.util.Scanner;

public class HomeWork52 {

    private static Scanner sc;
    public static void main(String[] args){

        foundOddNumbers();
    }
    public static void foundOddNumbers(){
        int size;
        int oddSum = 0;
        int oddCount = 0;

        sc = new Scanner(System.in);
        System.out.print(" Enter number of elements in an array : ");
        size = sc.nextInt();

        int [] array = new int[size];

        System.out.print(" Enter " + size + " elements of an Array  : ");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if(array[i] % 2 != 0) {
                oddSum += array[i];
                oddCount++;
            }
        }
        System.out.println(" The Sum of odd numbers in this Array --> " + oddSum);
        System.out.println(" Count of odd numbers --> " + oddCount);

    }
}
