package com.rituraj;
import java.util.Scanner;
//how to take input in java
public class Demo {
    public static void main(String[] args) {
        System.out.println( "What is your name");
//        Scanner input =new Scanner(System.in);
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println( "What is your age");
         int age =sc.nextInt();
        System.out.println("Hello "+name+" your age is " +age);



    }
}
