/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module3lab;

/**
 *
 * @author haris
 */
import java.util.Scanner;

public class SeparateDigits {
    
    public static int quotient(int a, int b) {
        return a / b;
    }
    
    public static int remainder(int a, int b) {
        return a % b;
    }
    
    public static void displayDigits(int number) {
        int divisor = 1000;
        while (divisor >= 1) {
            int digit = quotient(number, divisor);
            System.out.print(digit + "  ");
            number = remainder(number, divisor);
            divisor = quotient(divisor, 10);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();
        displayDigits(number);
    }
}

