//this is mutabilty of interger in java
//String are not mutable in java
package com.Array;
import java.util.Arrays;
public class PassingInFunctions {
    public static void main(String[] args) {
        int[] arr={21,34,234,56};
        System.out.println("Arrays are:" +Arrays.toString(arr));
        change(arr);
        System.out.println("Arrays are:" +Arrays.toString(arr));
    }
    static void change(int[]nums){
        nums[0]=99;
    }
}
