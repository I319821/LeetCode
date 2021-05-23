package com.lyw.leetcode.dp.dp002;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2}; //result = 5
//        int[] nums = {1,3,5,4,7}; //result = 2
//        int[] nums = {84,-48,-33,-34,-52,72,75,-12,72,-45}; //result = 4;
        test(nums);
    }

    public static void test(int[] nums){
        Solution solution = new Solution();
        int resultCount = solution.findNumberOfLIS(nums);
        System.out.print(resultCount);
    }
}


