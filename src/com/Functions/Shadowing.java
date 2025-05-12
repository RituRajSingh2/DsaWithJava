package com.Functions;
public class Shadowing {
    public static void main(String[] args) {
         int x=90;
        System.out.println(x);
        x=10;
//        but we can reassign
//        int x=10; this is wrong because u cannot initialise a variable twice
        System.out.println(x);
//        the output will be 90 and 10 because 90 is shadowed by 10 in second
        fun(x);
    }
    static void fun(int x){
        System.out.println(x);
    }

}
