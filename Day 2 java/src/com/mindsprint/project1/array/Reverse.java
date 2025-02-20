package com.mindsprint.project1.array;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int n=arr.length-1;
        for(int i=n;i>=0;i--){
            System.out.print(arr[i]+" ");
    }
    }
}
