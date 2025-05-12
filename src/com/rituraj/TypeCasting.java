package com.rituraj;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println();
        int a=10;
        double b=20;
        float c=21.323f;
        short d=40;
        long e=1000000000000000000L;
        double final_result = (((a + b) * (c - d)) + e);
        System.out.println(+(a+b)+" "+(c-d)+" ");
        System.out.println("final_result=" + final_result);
    }
}
