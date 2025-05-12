package com.Functions;
//import java .util.Scanner;
//passing the value of variable when you are calling method
public class Var_Len_Args {
    public static void main(String[] args) {
       fun( 2,4,"ram" ,"rohan", "sohan");
        boolean fun = false;
        System.out.println(fun);
    }
//    to pass multiple type variable length arguments
    static void fun(int a,int b ,String...v) {
       boolean fun = false;
    }
}




