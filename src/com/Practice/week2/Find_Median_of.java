package com.Practice.week2;
import java.util.Scanner;
import java.util.Arrays;
public class Find_Median_of {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr1:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+ " elements");
        int []arr1=new int [n];
        for (int i = 0; i <n ; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Arr1 Entered by user are:" + Arrays.toString(arr1));

        System.out.println("Enter the size of arr2:");
        int m=sc.nextInt();
        System.out.println("Enter "+m+ " elements");
        int []arr2=new int [m];
        for (int i = 0; i <n ; i++) {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Arr1 Entered by user are:" + Arrays.toString(arr2));
    Find_Median_of(arr1,arr2);
    }
    static void Find_Median_of(int[]arr1,int[]arr2){
      int n=arr1.length;
      int m=arr2.length;
      int[]merge=new int[m+n];
        System.arraycopy(arr1,0,merge,0, n);
        System.arraycopy(arr2,0,merge,n, m);
        System.out.println("merged array:");
    }
}
