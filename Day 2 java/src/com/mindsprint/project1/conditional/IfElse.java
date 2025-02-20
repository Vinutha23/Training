package com.mindsprint.project1.conditional;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num1=sc.nextInt();
        if (num1>0)
        System.out.println("The number is positive");
        else if (num1==0)
            System.out.println("Number is 0");
        else
            System.out.println("The number is negative");

    }
}
