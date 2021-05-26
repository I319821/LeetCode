package com.lyw.leetcode.dp.dp005;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4}; //result = 6
//        int[] nums = {-2,0,-1}; //result = 0
//        int[] nums = {-2,3,-4}; //result = 24

//        int[] nums = {2, -5, -2, -4, 3};//result = 24
        test(nums);

    }

    public static void test(int[] nums) {
        Solution solution = new Solution();
        int maxProduct = solution.maxProduct(nums);
        System.out.print(maxProduct);
    }
}
