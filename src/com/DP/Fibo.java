package com.DP;

public class Fibo {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("" +fibo(n));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2); // Use addition, not multiplication
    }
}
