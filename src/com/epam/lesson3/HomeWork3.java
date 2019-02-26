package com.epam.lesson3;

public class HomeWork3 {
    public static void main (String[] args){

        int i = 0;
        char x = '*';

        String y = Integer.toString(i);
        String newi = String.valueOf(x);
        String z = Character.toString(x);
        String h = Character.toString(x) + Character.toString(x);


        while (i < 5) {
            System.out.println( z + i++ );

        }
    }
}
