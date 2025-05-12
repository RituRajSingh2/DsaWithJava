//print number from 1 to n
package com.Loops;
import java.util.Scanner;
public class PrintNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
    }
}
