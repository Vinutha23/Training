package com.mindsprint.project1.array;

public class SortedManner {
    public static void main(String[] args) {
        int[] arr={9,2,0,8,1};
        int n=arr.length-1;
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
