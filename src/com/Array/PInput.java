package com.Array;
import java.util.Scanner;
import java.util.Arrays;
public class PInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of Arrays:");
        int n= input.nextInt();
        System.out.println("Enter "+n+ " elements");
        int[]numbers=new int[n];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=input.nextInt();
        }
        System.out.println("Array input by Users are:" +Arrays.toString(numbers));
    }
}
