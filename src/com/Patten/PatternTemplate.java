
//not my solution
package com.Patten;
import java.util.Scanner;
public class PatternTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size of pattern
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        // Outer loop (for rows)
        for (int i = 1; i <= n; i++) {
            // Example: Print spaces (for pyramid shapes)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Example: Print stars (or any symbol/number logic)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
        sc.close();
    }
}

