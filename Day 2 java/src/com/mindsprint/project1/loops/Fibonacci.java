package com.mindsprint.project1.loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int third;
        int first=0;
        int second=1;
        for(int i=2;i<n;i++){
        third=first+second;
        System.out.println(third);
        first=second;
        second=third;


        }
    }
}
