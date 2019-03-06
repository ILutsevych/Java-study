package com.epam.lesson4;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args)
    {
        int a;
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number --> ");
        a = sc.nextInt();
        while(a > 0)
        {
            int y = a % 2;
            str = y + str;
            a = a / 2;
        }
        System.out.println("The binary conversion is " + str);
        sc.close();
    }
}
