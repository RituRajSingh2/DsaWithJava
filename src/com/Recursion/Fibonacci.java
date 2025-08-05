package com.Recursion;
import java.util.Scanner;
import java.util.Arrays;
public class Fibonacci {
    public static void main(String[] args) {
int n=6;
    }
    static int fibo1(int n){
        if (n<=1 ) {
            return n;
        }
            else {
               return fibo1(n-1)+fibo1(n-2);
        }
    }
}
