package com.lyw.leetcode.dp.dp001;

public class Main {
    public static void main(String[] args) {
        int[] num = {4,10,4,3,8,9};
        test(num);

    }

    public static void test(int[] num){
        Solution solution = new Solution();
        int length = solution.lengthOfLIS(num);
        System.out.print(length);
    }
}
