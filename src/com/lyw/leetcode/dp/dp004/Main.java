package com.lyw.leetcode.dp.dp004;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; //result = 6
        test(nums);
    }

    public static void test(int[] nums){
//        Solution1 solution1 = new Solution1();
//        int maxSum = solution1.maxSubArray(nums);

        Solution solution = new Solution();
        int maxSum = solution.maxSubArray(nums);

        System.out.print(maxSum);
    }
}
