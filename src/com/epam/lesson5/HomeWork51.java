package com.epam.lesson5;

public class HomeWork51 {
    public static void main(String[] args) {

        doReverse();
    }

    public static void doReverse( ) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println("Original array: ");

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Array in reverse order: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
