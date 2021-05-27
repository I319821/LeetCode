package com.lyw.leetcode.dp.dp006;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {1,-2,3,-2};//result = 3
//        int[] nums = {5,-3,5}; // result = 10
//        int[] nums = {3,-1,2,-1}; //result = 4
//        int[] nums = {-5,3,5}; //result = 8
        int[] nums = {-2,2,-2,9}; //result = 9

        test(nums);
    }

    public static void test(int[] nums){
//        Solution solution = new Solution();
//        int maxSum = solution.maxSubarraySumCircular(nums);

        Solution1 solution1 = new Solution1();
        int maxSum = solution1.maxSubarraySumCircular(nums);
        System.out.print(maxSum);

    }
}
