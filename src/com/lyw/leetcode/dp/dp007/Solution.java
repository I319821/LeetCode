package com.lyw.leetcode.dp.dp007;

public class Solution {
    public int[] getMaxMatrix(int[][] matrix) {
        int[] maxSumMatrix = new int[4];

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[]{-1, -1, -1, -1};

        int maxSum = matrix[0][0];
        int matrixLength = matrix.length;
        int matrixWidth = matrix[0].length;

        int[][] sumMatrix = new int[matrixLength][matrixWidth];


        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                sumMatrix[i][j] = matrix[i][j];
                maxSum = replaceMaxSum(maxSumMatrix, maxSum, sumMatrix[i][j], i, j,i,j);
                for (int k = j+1; k < matrixWidth; k++) {
                    sumMatrix[i][k] = matrix[i][k]+sumMatrix[i][k-1];
                    maxSum = replaceMaxSum(maxSumMatrix, maxSum, sumMatrix[i][k], i, j,i,k);
                }

                for (int p = i+1; p < matrixLength; p++) {
                    sumMatrix[p][j] = matrix[p][j]+sumMatrix[p-1][j];
                    maxSum = replaceMaxSum(maxSumMatrix, maxSum, sumMatrix[p][j], i, j,p,j);
                }

                for (int p = i + 1; p < matrixLength; p++) {
                    for (int k = j + 1; k < matrixWidth; k++) {
                        sumMatrix[p][k] = matrix[p][k] + sumMatrix[p - 1][k] + sumMatrix[p][k - 1] - sumMatrix[p - 1][k - 1];
                        maxSum = replaceMaxSum(maxSumMatrix, maxSum, sumMatrix[p][k], i, j,p,k);
                    }
                }
            }
        }

        return maxSumMatrix;
    }

    private int replaceMaxSum(int[] maxSumMatrix, int maxSum, int sumMatrix, int i, int j,int p,int k) {
        if(sumMatrix > maxSum){
            maxSum = sumMatrix;
            maxSumMatrix[0] = i;
            maxSumMatrix[1] = j;
            maxSumMatrix[2] = p;
            maxSumMatrix[3] = k;
        }
        return maxSum;
    }
}
