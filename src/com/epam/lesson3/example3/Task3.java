package com.epam.lesson3.example3;

public class Task3 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 9) {
            int value = line;
            while (value >= 1) {
                System.out.print(value);
                value--;
            }
            System.out.println();
            line++;
        }
    }
}
