package com.bridgelabz.OperatorPrograms;

import java.util.Scanner;

/*
Write a program Distance.java that takes two integer command-line arguments x and y
and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scanner. nextDouble();
        System.out.println("Enter the value of y: ");
        double y = scanner. nextDouble();
        //distance from origin(0,0)
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("The Distance is "+distance);
    }
}
