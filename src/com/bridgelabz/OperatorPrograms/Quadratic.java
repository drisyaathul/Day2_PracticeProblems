package com.bridgelabz.OperatorPrograms;

import java.util.Scanner;

/*
 Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b, and c as input values to find the roots of x.
 */
public class Quadratic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'a' : ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of 'b' : ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of 'c' : ");
        int c = scanner.nextInt();

        double r1,r2;
        double delta = (b*b-4*a*c);
        if (delta>0) {
             r1=(-b+Math.sqrt(delta)/(2*a));
             r2=(-b-Math.sqrt(delta)/(2*a));
            System.out.println("The roots are: " + r1 + " and " + r2);
        }else if (delta == 0) {
            r1 = -b / (2.0 * a);
            System.out.println("The root is "+r1);
        }else
            System.out.println("The Roots are Imaginary");


    }
}
