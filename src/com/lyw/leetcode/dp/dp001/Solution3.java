package com.lyw.leetcode.dp.dp001;

public class Solution3 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;

        int[] d = new int[nums.length];
        d[0] = nums[0];
        int length = 1;

        for(int i =1; i<nums.length;i++){
            if(nums[i] < d[length - 1]){
                if(nums[i] < d[0]){
                    d[0] = nums[i];
                }else{
                    for(int j = length-1;j>=0;j--){
                        if(d[j]<nums[i]){
                            d[j+1] = nums[i];
                            break;
                        }
                    }
                }
            }else if(nums[i] > d[length - 1]){
                d[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
