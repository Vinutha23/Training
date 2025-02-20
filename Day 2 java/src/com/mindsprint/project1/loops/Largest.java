package com.mindsprint.project1.loops;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a=sc.nextInt();
        System.out.println("Enter another number:");
        int b=sc.nextInt();
        if(a>b)
            System.out.println("A is largest");
        else
            System.out.println("B is largest");
    }
}
