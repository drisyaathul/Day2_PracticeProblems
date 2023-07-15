package com.bridgelabz.IfElseStatement;

import java.util.Scanner;

// Read a Number 1,10,100,1000 and display unit, ten hundred
public class ReadANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number (1,10,100,1000): ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("UNIT");
        } else if (number == 10) {
            System.out.println("TEN");
        } else if (number == 100) {
            System.out.println("HUNDRED");
        } else if (number == 1000) {
            System.out.println("THOUSAND");
        }else {
            System.out.println("INVALID INPUT !!!");
        }
    }
}
