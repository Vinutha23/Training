package com.mindsprint.project1.basics;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age=scanner.nextInt();
        String result=(age>=18)?"Valid for Vote":"Not valid for vote";
        System.out.println("result is:"+result);

        System.out.println("Enter selling price:");
        int sp=scanner.nextInt();
        System.out.println("enter purchase price:");
        int pp=scanner.nextInt();
        String answer=(sp>pp)?"loss of:"+(sp-pp):"profit of:"+(pp-sp);
        System.out.println(answer);
    }
}
