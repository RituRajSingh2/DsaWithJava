package com.Functions;
import java.util.Scanner;
public class Basics_Re {
    public static void main(String[] args) {
int dum=sum();
        System.out.println(dum);
    }
//    to return the value
    static int sum(){
Scanner in=new Scanner(System.in);
        System.out.print("Enter first number:");
int num1=in.nextInt();
        System.out.print("Enter Second number:");
int num2=in.nextInt();
        int sum = num1 + num2;
//        System.out.println("the sum is:"+sum);
        return sum;
    }
}
