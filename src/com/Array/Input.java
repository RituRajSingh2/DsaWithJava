package com.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        int[]arr=new int[6];
//        first way to take input
        arr[0]=12;
        arr[1]=32;
        arr[2]=72;
        arr[3]=68;
        arr[4]=78;
        arr[5]=43;
        System.out.println(arr[3]);
//        second way to take input
        int [] arr1={12,32,72,68,78,43};
//        taking input using loop
        Scanner in=new Scanner(System.in);
        System.out.println("enter value:");
        for(int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr+" ");
        }
    }
}
