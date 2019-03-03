package com.epam.lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
    }

    public static void one( ) {
        char a = '*';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void two( ) {
        char a = '*';
        int count = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < count) {
                    System.out.print(" ");
                } else {
                    System.out.print(a);
                }
            }
            count++;
            System.out.println();
        }
    }

    public static void three( ) {
        char a = '*';
        int count = 4;

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (j > count) {
                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            count--;
            System.out.println();
        }

    }

    public static void four( ) {
        char s1 = ' ';
        char s2 = '*';
        int a = 4;
        int b = 0;

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (j > a) {
                    System.out.print(s2);
                } else {
                    System.out.print(s1);
                }
            }
            a--;
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < b) {
                    System.out.print(s1);
                } else {
                    System.out.print(s2);
                }
            }
            b++;
            System.out.println();
        }
    }

    public static void five( ) {
        char s1 = ' ';
        char s2 = '*';
        int a = 4;
        int b = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 9; k++) {
                    if (k < a || k > b) {
                        System.out.print(s1);
                    } else {
                        System.out.print(s2);
                    }
                }
                System.out.println();
                a--;
                b++;
            }
            a = 4;
            b = 4;

        }
    }
}