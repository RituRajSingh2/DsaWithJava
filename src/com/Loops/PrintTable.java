//print table of n?
package com.Loops;
import java.util.Scanner;
public class PrintTable {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+"x" +i+"="+(n * i));
//            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
