package com.bridgelabz.ForLoop;
//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N Natural Numbers :- ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of N natural numbers : "+sum);
    }
}
