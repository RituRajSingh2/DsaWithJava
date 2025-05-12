package com.rituraj;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=input.nextInt();
        System.out.println("Enter Second number:");
        int num2=input.nextInt();
        int sum= num1+num2;
        System.out.println("Sum="+sum);
        input.close();
    }
}