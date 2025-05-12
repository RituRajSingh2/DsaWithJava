package com.Patten;

public class Pattern1 {
    public static void main(String[] args) {
       Pattern1(4);
    }
   static void Pattern1(int n){
       for (int rows = 1; rows <= n; rows++) {
           for (int cols = 1; cols <=rows; cols++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}
