package com.epam.lesson5;

import java.util.Scanner;

public class HomeWork53 {
    public static void main(String[] args) {

       createNewArray();
      }

    public static void createNewArray(){

        int size;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in arrays :");

        size = sc.nextInt();

        int[] arrayOne = new int[size];
        int[] arrayTwo = new int[size];

        System.out.print("Enter " + size + " elements of an Array #1 : ");

        for (int i = 0; i < size; i++) {
            arrayOne[i] = sc.nextInt();
        }

        System.out.print("Enter " + size + " elements of an Array #2 : ");

        for (int i = 0; i < size; i++) {
            arrayTwo[i] = sc.nextInt();
        }
        int[] arrayThree = new int[size];

        System.out.print("Elements of Array #3 : ");

        for (int i = 0; i < size; i++) {
            arrayThree[i] = arrayOne[i] + arrayTwo[i];
            System.out.print(arrayThree[i] + " ");
        }
    }
}
