package com.mindsprint.project1.array;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array=new int[5];
        String[] name={"test1","test2","test3"};
        System.out.println("Access Direct:"+name[0]);
        System.out.println("Accessing using for loop");
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
            System.out.println("Enter any Number:");
            array[i]=sc.nextInt();
        }
        for(int num:array)
            System.out.println(num+" ");
    }
}
