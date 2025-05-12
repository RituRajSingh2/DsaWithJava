package com.Loops;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a fruit:");
        String fruit=sc.next();
        switch(fruit){
            case "Mango":
                System.out.println("king of fruits");
                break;
                case "Apple":
                System.out.println("A Red fruit");
//                break;
                case "Orange":
                System.out.println("A round fruit");
//                break;
                case "Grapes":
                System.out.println("A small fruit");
                break;
                default:
                System.out.println("Enter valid fruit");
        }
    }
}

