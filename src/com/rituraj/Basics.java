package com.rituraj;
import java.util.Scanner;
//celsius to fahrenheit converter
public class Basics {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");
        double celsius=in.nextDouble();
        double fahrenheit=1.8*celsius+32;
        System.out.println("Temperature in fahrenheit:"+fahrenheit);
        in.close();
    }
}
