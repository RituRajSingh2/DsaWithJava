package com.Loops;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().trim().charAt(0);
//        'a' is character a
        if (ch>='a'&&ch<='z'){
            System.out.println("LowerCase");
        }
        else if(ch>='A'&&ch<='Z'){
            System.out.println("UpperCase");
        }
        else{
            System.out.println("Neither upperCAse nor LowerCase");
        }
    }
}

//package com.Loops;
//import java.util.Scanner;
//public class CaseCheck {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the character:");
//        char ch=sc.next().trim().charAt(0);
//        if (Character.isUpperCase(ch)) {
//            System.out.println("Uppercase");
//        } else if (Character.isLowerCase(ch)) {
//            System.out.println("Lowercase");
//        } else {
//            System.out.println("Neither uppercase nor lowercase");
//        }
//    }
//}
