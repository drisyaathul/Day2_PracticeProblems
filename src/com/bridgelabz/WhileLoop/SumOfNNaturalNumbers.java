package com.bridgelabz.WhileLoop;
//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N Natural Numbers : ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i<=n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of N Numbers : "+sum);
    }
}
