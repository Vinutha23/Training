package com.mindsprint.project1.basics;
import java.util.Scanner;
public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scanner.nextInt();
        System.out.println("Enter second number:");
        int num2=scanner.nextInt();
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Additin of two number:"+(num1+num2));
        System.out.println("Substraction of two numbers : "+(num1-num2));
        System.out.println("My name is :"+name);


    }
}
