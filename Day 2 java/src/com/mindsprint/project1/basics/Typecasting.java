package com.mindsprint.project1.basics;

public class Typecasting {
    public static void main(String[] args) {
        short data=10;
        float data1=data;
        System.out.println("Data:"+data);//implicit

        double info=78.78;
        int info1=(int)info;//explicit there is a loss of number 78
        System.out.println("Info:"+info1);

        char a ='A';
        System.out.println("ASCII No:"+(int)a);
        System.out.println("ASCII No:"+(char)((int)a+32));

    }
}
