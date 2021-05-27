package com.lyw.leetcode.dp.dp004;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxSum = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = nums[i] + Math.max(cur, 0);
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }
}
