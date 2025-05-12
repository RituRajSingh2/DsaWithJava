package com.MathsForDSA;
import java.util.Scanner;
public class PrimeCheck2 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <n-1 ; i++) {
            if(n%i==0){
                 return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
}
