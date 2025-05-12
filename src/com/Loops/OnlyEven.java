//only even from 1 to n
package com.Loops;
import java.util.Scanner;
public class OnlyEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int m=n/2;
        for (int i = 0; i <=m ; i++) {
            System.out.println(2+"X" +i+ "=" +(2*i));
        }
    }
}
