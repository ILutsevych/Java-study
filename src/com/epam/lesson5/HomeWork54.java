package com.epam.lesson5;

public class HomeWork54 {
    public static void main(String[] args) {
        homeWork();
    }

    public static void homeWork( ) {
        int[] sourceArray = {15, 33, -10, 0, 43, 585, -5, -55, 43, 12, 0, -959, -67};
        int[] positiveArray;
        int[] negativeArray;
        int positive = 0;
        int negative = 0;

        for (int element : sourceArray) {
            if (element > -1) {
                positive++;
            } else {
                negative++;
            }
        }
        positiveArray = new int[positive];
        negativeArray = new int[negative];

        positive = 0;
        negative = 0;

        for (int element : sourceArray) {
            if (element > -1) {
                positiveArray[positive] = element;
                positive++;
            } else {
                negativeArray[negative] = element;
                negative++;
            }
        }
        System.out.println("Source array: ");
        for (int element : sourceArray) {
            System.out.print(element + " ");
        }
        System.out.println("\nPositive array: ");
        for (int element : positiveArray) {
            System.out.print(element + " ");
        }
        System.out.println("\nNegative array: ");
        for (int element : negativeArray) {
            System.out.print(element + " ");
        }

    }
}
