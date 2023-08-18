package com.interswitch.maven;

import java.util.Scanner;

public class SimpleArithmetic {
    private double num1;
    private double num2;
    public SimpleArithmetic(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double addition(){return num1 + num2;}
    public double subtraction(){return num1 - num2;}
    public double multiplication(){return num1 * num2;}
    public double division(){return num1 / num2;}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Enter the second number: ");
//        double num2 = scanner.nextDouble();
//
//        SimpleArithmetic sa = new SimpleArithmetic(num1, num2);
//
//        System.out.println("Division result: " + sa.division());
//        System.out.println("Addition result: " + sa.addition());
//        System.out.println("Subtraction result: " + sa.subtraction());
//        System.out.println("Multiplication result: " + sa.multiplication());
//
//        scanner.close();
//    }
}
