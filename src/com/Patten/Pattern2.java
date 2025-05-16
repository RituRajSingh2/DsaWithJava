// what is learn in this is my class name and method name is same so
// my output i going to be
//         cols
//         colscols
//         colscolscols
//         colscolscolscols
//         colscolscolscolscols rather than what it should be
//so u need to have different class and method name

package com.Patten;
public class Pattern2 {
    public static void main(String[] args) {
        Print_Pattern2(5);
    }
    static void Print_Pattern2(int n) {
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
