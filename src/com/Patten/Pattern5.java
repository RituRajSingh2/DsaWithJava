//package com.Patten;
//public class Pattern5 {
//    public static void main(String[] args) {
//        printPattern5(9);
//    }
//    static void printPattern5(int n) {
//        int mid = (n / 2) + 1;
//        for (int r = 1; r <= n; r++) {
//            int stars;
//            if (r <= mid) {
//                stars = r; // Upper half: increasing
//            } else {
//                stars = n - r + 1; // Lower half: decreasing
//            }
//            for (int c = 1; c <= stars; c++) {
//                System.out.print("*");
//            }
//            System.out.println(); // Move to the next line
//        }
//    }
//}


package com.Patten;
public class Pattern5{
    public static void main(String[] args) {
        Print_Pattern5(5);
    }
    static void Print_Pattern5(int n) {
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <= n-rows ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}