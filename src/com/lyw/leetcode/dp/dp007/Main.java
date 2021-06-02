package com.lyw.leetcode.dp.dp007;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{-1,0},{0,-1}};//[ 0,1,0,1 ]
        test(matrix);
    }

    public static void test(int[][] matrix){
//        Solution solution = new Solution();
//        int[] maxSumMatrix = solution.getMaxMatrix(matrix);

        Solution1 solution1 = new Solution1();
        int[] maxSumMatrix1 = solution1.getMaxMatrix(matrix);
        System.out.print(maxSumMatrixString(maxSumMatrix1));
    }

    public static String maxSumMatrixString(int[] maxSumMatrix){
        return "[ "
                + maxSumMatrix[0] +","
                + maxSumMatrix[1] +","
                + maxSumMatrix[2] +","
                + maxSumMatrix[3] +" ]";

    }
}
