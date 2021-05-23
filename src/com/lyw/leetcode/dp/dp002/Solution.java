package com.lyw.leetcode.dp.dp002;

import java.util.Arrays;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int length[] = new int[nums.length];
        int count[] = new int[nums.length];
        int maxLength = 1;
        int resultCount = 0;

        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return 1;

        Arrays.fill(length,1);
        count[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    length[i] = Math.max(length[i], length[j] + 1);
                    maxLength = Math.max(maxLength, length[i]);
                }
            }

            for (int k = i - 1; k >= 0; k--) {
                if (nums[i] > nums[k] && length[i] == length[k] + 1) {
                    count[i] += count[k];
                }
            }
            if(count[i] == 0) count[i] =1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (maxLength == length[i]) {
                resultCount += count[i];
            }
        }

        return resultCount;
    }
}
