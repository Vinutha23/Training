package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int percent=sc.nextInt();
        if (percent>=70 && percent<=100)
            System.out.println("Congratulations ...! You got distinction");
        if (percent>=60 && percent<=70)
            System.out.println("Congratulations ...! You got first class");
        else if (percent>=50 && percent<60)
            System.out.println("Congratulation..! You got second class");
        else if(percent >=35 && percent <50)
            System.out.println("Congratulations...!! You got third class");
        else if(percent >=0 && percent <35)
            System.out.println("Sorry you are fail");
        else
            System.out.println("Kindly enter the valid input");

    }
}
