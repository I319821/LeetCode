package com.lyw.leetcode.dp.dp007;

import java.util.Arrays;

public class Solution1 {
    public int[] getMaxMatrix(int[][] matrix) {
        int[] maxSumMatrix = new int[4];

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[]{-1, -1, -1, -1};


        int maxSum = matrix[0][0];
        int matrixLength = matrix.length;
        int matrixWidth = matrix[0].length;
        int[] sumOfColumn = new int[matrixWidth];
        int[] dp = new int[matrixWidth];


        for (int i = 0; i < matrixLength; i++) {
            Arrays.fill(sumOfColumn,0);
            for (int j = i; j < matrixLength; j++) {
                for(int k=0;k<matrixWidth;k++){
                    sumOfColumn[k] = sumOfColumn[k]+matrix[j][k];
                }

                dp[0] = sumOfColumn[0];
                maxSumMatrix[3] = 0;                maxSumMatrix[1] = 0;

                for(int k=1;k<matrixWidth;k++){
                    if(dp[k-1] <0){
                        maxSumMatrix[1] = k;
                        maxSumMatrix[3] = k;
                        dp[k]=sumOfColumn[k];
                    }else{
                        dp[k] = dp[k-1]+sumOfColumn[k];
                    }
                    if(maxSum<dp[k]){
                        maxSumMatrix[0]= i;
                        maxSumMatrix[2]=j;
                        if(dp[k-1]<0){
                            maxSumMatrix[3] = k;
                        }
                    }
                }
            }
        }


        return maxSumMatrix;
    }


}
