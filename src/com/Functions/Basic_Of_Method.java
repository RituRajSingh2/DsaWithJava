package com.Functions;
import java.util.Scanner;
public class Basic_Of_Method {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Num1:");
        int num1=input.nextInt();
        System.out.print("Enter Num2:");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is:" +sum);
//        why this is so?
//        class MathUtils {
//            static int add(int a, int b) {
//                return a + b;
//            }
//        }
//
//// Usage
//        int sum = MathUtils.add(10, 20);  // No object created
//        System.out.println("sum is:"+sum);
    }
}
