package com.lyw.leetcode.dp.dp006;

public class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int[] sumLeft = new int[nums.length];
        int[] maxLeft = new int[nums.length];
        sumLeft[0] = nums[0];
        maxLeft[0] = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i];
            maxLeft[i] = Math.max(maxLeft[i-1],sumLeft[i]);

            cur = nums[i] + Math.max(cur,0);
            maxSum = Math.max(maxSum, cur);
        }

        int[] sumRight = new int[nums.length];
        int[] maxRight = new int[nums.length];
        sumRight[nums.length - 1] = nums[nums.length - 1];
        maxRight[nums.length-1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sumRight[i] = nums[i] + sumRight[i + 1];
            maxRight[i] = Math.max(maxRight[i+1],sumRight[i]);
        }

        for(int i=0;i<nums.length-2;i++){
            maxSum = Math.max(maxSum,maxLeft[i] + maxRight[i+2]);
        }

        return maxSum;

    }
}
