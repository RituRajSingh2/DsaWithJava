package com.Practice.week1;
import java.util.Arrays;
public class pivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int ans=pivotIndex(nums);
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("pivot Index is: " +ans);
    }
    static void change(int[]nums){
        nums[2]=20;
        nums[4]=22;
    }
    static int  pivotIndex(int[] nums){
//   Lets find TotalSum
        int TotalSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            TotalSum+=nums[i];
        }
        int LeftSum=0;
        for(int i=0;i<n;i++){
        int RightSum=TotalSum-LeftSum-nums[i];
        if(RightSum==LeftSum){
            return i;
        }
        LeftSum+=nums[i];
        }
        return -1;
    }
}
