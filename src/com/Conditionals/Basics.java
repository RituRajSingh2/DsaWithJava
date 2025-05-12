//calculates a bonus for employees based on their salary
        package com.Conditionals;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        System.out.println("Enter the salary of Employees:");
Scanner input=new Scanner(System.in);
double salary=input.nextDouble();
if (salary >=10000) {
    salary = salary + 2000;
     }
else{
    salary=salary+1000;
}
        System.out.println("new salary is :"  +salary);
input.close();
    }
}
