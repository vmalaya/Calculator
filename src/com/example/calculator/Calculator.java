package com.example.calculator;

import java.util.Scanner;

/**
 * Created by Валентина on 12.05.2017.
 */
public class Calculator {
    public static  void main(String[] arg) {
        int a;
        int b;

        System.out.println("Please input first number: ");
        Scanner ScannerFirst = new Scanner(System.in);
        a = ScannerFirst.nextInt();
        System.out.printf("Your input %d as a first number.\n", a);

        System.out.println("Please input second number:");
        Scanner ScannerSecond = new Scanner(System.in);
        b = ScannerSecond.nextInt();
        System.out.printf("Your input %d as a second number.\n", b);

        System.out.println("Sum is " + (a + b));
        System.out.println("Difference is " + (a - b));
        System.out.println("Multiplication is " + (a * b));
        if (b == 0) {
            System.out.println("Division is Infinity");
        } else{
        System.out.println("Division is " + (a / b));}
    }
}
