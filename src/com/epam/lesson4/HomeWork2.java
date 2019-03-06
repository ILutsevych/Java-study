package com.epam.lesson4;

import java.util.Scanner;

public class HomeWork2 {

        public static void main (String[]args) {

            Scanner sc = new Scanner(System.in);
            String word = "";

            System.out.println("Enter a word: ");
            word = sc.nextLine();

            getUniqueChars(word);
        }
            public static void getUniqueChars(String str) {
            String tmp = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (tmp.indexOf(ch) == -1) {
                    tmp += ch;
                } else {
                    tmp = tmp.replace(String.valueOf(ch),"");
                }
            }
            System.out.println(tmp + " ");
        }


}


