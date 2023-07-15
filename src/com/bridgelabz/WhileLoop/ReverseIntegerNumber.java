package com.bridgelabz.WhileLoop;
//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
import java.util.Scanner;

public class ReverseIntegerNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer Number : ");
        int number = scanner.nextInt();
        int reverse = 0;
        int i = 0;

        while (number>=1) {
            i = number%10;
            reverse = reverse*10 + i;
            number = number/10;
        }
        System.out.println("Reverse the Number : "+reverse);
    }
}
