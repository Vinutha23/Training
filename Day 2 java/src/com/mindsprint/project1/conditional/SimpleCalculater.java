package com.mindsprint.project1.conditional;
import java.util.Scanner;
public class SimpleCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=sc.nextInt();
        System.out.println("Enter any number:");
        int b=sc.nextInt();
        System.out.println("enter + for addition , - for substraction , * for multiplication, / for division");
        String input=sc.next();
        switch(input){
            case "+":
                System.out.println("Addition:"+(a+b));
                break;
            case "-":
                System.out.println("substraction:"+(a-b));
                break;
            case "*":
                System.out.println("multiplication:"+(a*b));
                break;
            case "/":
                System.out.println("division:"+(a/b));
                break;
            default:
                System.out.println("Enter the valid input");
        }
    }
}
