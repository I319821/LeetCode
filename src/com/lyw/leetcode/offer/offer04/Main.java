package com.lyw.leetcode.offer.offer04;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 100;

        test(matrix,target);


    }

    public static void test(int[][] matrix, int target) {
        long begin;
        boolean result;
        long end;
        Solution solution = new Solution();
        result = solution.findNumberIn2DArray(matrix,target);
        System.out.print(result);
    }
}
