//package com.Loops;
//import java.util.Scanner;
//public class LargestOf3 {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the First number:");
//        int a=input.nextInt();
//        System.out.println("Enter the Second number:");
//        int b=input.nextInt();
//        System.out.println("Enter the Third number:");
//        int c=input.nextInt();
//        if(a>=b&&a>=c){
//            System.out.println("Largest number is:"+a);
//        } else if(b>=a&&b>=c) {
//            System.out.println("Largest number is:"+b);
//        }else{
//            System.out.println("Largest number is:"+c);
//        }
//    }
//}

package com.Loops;
import java.util.Scanner;
public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
//        int max = Math.max(a, Math.max(b, c));
        int max=a;
        if( b>=max){
            max=b;
        }
        if (c>=max){
            max=c;
        }
        System.out.print("maximum is:"+max);
    }
}
