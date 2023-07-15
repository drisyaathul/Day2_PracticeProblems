package com.bridgelabz.OperatorPrograms;

import java.util.Scanner;
/*
Write a program SpringSeason.java that takes two int values m and d from the command line
and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
 */
public class SpringSeason {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month ,m : ");
        int m = scanner.nextInt();
        System.out.println("Enter the Day,d : ");
        int d = scanner.nextInt(); 
        
        if (m == 3 && d>=20 && d<=31) {
            System.out.println("True");
        } else if (m == 4 && d>=1 && d<=30) {
            System.out.println("True");
        } else if (m == 5 && d>=1 && d<=31) {
            System.out.println("True");
        } else if (m == 6 && d>=1 && d<=20) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
