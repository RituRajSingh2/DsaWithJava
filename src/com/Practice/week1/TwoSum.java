package com.Practice.week1;
public class TwoSum {
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=9;
        int[] result=TwoSum( nums,target);
        if(result != null){
            System.out.println("Indices are:"+result[0]+","+result[1]);
        }
        else{
            System.out.println("No such indices exist");
        }
    }
    static int[]TwoSum(int [] nums,int target){
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
//  == is used for comparison and = is is used for assignment
                if(nums[i]==nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
