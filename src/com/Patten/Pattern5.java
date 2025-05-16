
package com.Patten;
public class Pattern5 {
    public static void main(String[] args) {
        Print_Pattern5(5);
    }
    static void Print_Pattern5(int n) {
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <= n-rows ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}