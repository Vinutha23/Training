package com.mindsprint.project1.loops;

public class ForLoop {
    public static void main(String[] args) {
//        int n=10;
//        int i=0;
//        for(i=0;i<n;i++)
//            System.out.print(i+",");
        int i=1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println("DO While");
        int j=0;
        do{
            System.out.println(j);
            j++;
        }while(j<10);

    }
}
