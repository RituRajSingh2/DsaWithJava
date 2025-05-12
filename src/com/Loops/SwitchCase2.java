package com.Loops;
import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day:");
        String day=sc.next();
        switch(day){
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.println("Weekday");
//            case "Saturday":
//            case "Sunday":
//                System.out.println("Weekend");
//            default:
//                System.out.println("Enter a Valid day");
            case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
                    System.out.println("Weekday");
            case "Saturday","Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid day");
        }
    }
}
