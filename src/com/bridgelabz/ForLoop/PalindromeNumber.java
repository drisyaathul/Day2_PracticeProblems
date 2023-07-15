package com.bridgelabz.ForLoop;

import java.util.Scanner;

//Write a Program to find Palindrome Number
public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        int temp = number;

        for (int i=0; number>=1; i++){
            i = number%10;
            reverse = reverse*10 + i;
            number = number/10;
        }
        if (temp == reverse) {
            System.out.println("The Number is a Palindrome");
        } else
            System.out.println("The Number is Not a Palindrome");
    }
}
