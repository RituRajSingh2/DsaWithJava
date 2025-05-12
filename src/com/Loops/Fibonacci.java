package com.Loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int temp=b;
            b=a+b;
            a=temp;
        }
        System.out.println("fibonacci is:"+a);
    }
}

//}package com.Loops;
//import java.util.Scanner;
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n = sc.nextInt();
//        int[] fib = new int[n + 1];
//        fib[0] = 0;
//        if (n > 0) {
//            fib[1] = 1;
//        }
//        for (int i = 2; i <= n; i++) {
//            fib[i] = fib[i - 1] + fib[i - 2];
//        }
//        System.out.println("Fibonacci series up to " + n + ":");
//        for (int i = 0; i <= n; i++) {
//            System.out.print(fib[i] + " ");
//        }
//    }
//}

