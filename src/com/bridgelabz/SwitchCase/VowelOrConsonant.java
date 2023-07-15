package com.bridgelabz.SwitchCase;

import java.util.Scanner;

//Write a Program to Check Vowel or Consonant
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println(ch+" is a Vowel.");
                break;
            default:
                System.out.println(ch+" is a Consonant");
        }
    }
}
