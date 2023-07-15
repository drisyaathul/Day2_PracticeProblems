package com.bridgelabz.ForLoop;
//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
import java.util.Scanner;

public class ReverseTheIntegerNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer Number : ");
        int number = scanner.nextInt();
        int reverse = 0;

        for (int i=0; number>=1; i++) {
            i = number%10;
            reverse = reverse*10 + i;
            number = number/10;
        }
        System.out.println("Sum of Integer Number : "+reverse);
    }
}
