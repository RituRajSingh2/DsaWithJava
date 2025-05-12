package com.Patten;

public class Pattern2 {
    public static void main(String[] args) {
        Pattern2(5);
    }
    static void Pattern2(int n) {
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <=n ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
