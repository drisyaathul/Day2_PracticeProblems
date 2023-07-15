package com.bridgelabz.OperatorPrograms;

import java.util.Scanner;

/*Enter two numbers and do the following arithmetic Operations find max and min.
  i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number,a : ");
        int a = scanner.nextInt();
        System.out.println("Enter the number,b : ");
        int b = scanner.nextInt();
        System.out.println("Enter the number,c : ");
        int c = scanner.nextInt();
        int x1,x2,x3,x4;
        x1 = a+b*c;
        x2 = c+a/b;
        x3 = a%b+c;
        x4 = a*b+c;
        System.out.println("x1 is "+x1);
        System.out.println("x2 is "+x2);
        System.out.println("x3 is "+x3);
        System.out.println("x4 is "+x4);
        System.out.println("--------------------");
        if(x1>x2 && x1>x3 && x1>x4){
            System.out.println("The maximum of all values is "+x1);
        }else if (x2>x1 && x2>x3 && x2>x4){
            System.out.println("The maximum of all values is "+x2);
        }else if (x3>x1 && x3>x2 && x3>x4) {
            System.out.println("The maximum of all values is "+x3);
        }else
            System.out.println("The maximum of all values is "+x4);

        if(x1<x2 && x1<x3 && x1<x4){
            System.out.println("The minimum of all values is "+x1);
        }else if (x2<x1 && x2<x3 && x2<x4){
            System.out.println("The minimum of all values is "+x2);
        }else if (x3<x1 && x3<x2 && x3<x4) {
            System.out.println("The minimum of all values is "+x3);
        }else
            System.out.println("The minimum of all values is "+x4);

    }
}
