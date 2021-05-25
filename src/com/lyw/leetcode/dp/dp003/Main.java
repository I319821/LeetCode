package com.lyw.leetcode.dp.dp003;

public class Main {
    public static void main(String[] args) {
//        int[][] envelopes = {{1,5},{1,4},{1,2},{2,3}}; //result = 2
        int[][] envelopes = {{4,5},{4,6},{6,7},{2,3},{1,1}}; //result = 4

        test(envelopes);

    }
    public static void test(int[][] envelopes){
        Solution solution = new Solution();
        int resultCount = solution.maxEnvelopes(envelopes);
        System.out.print(resultCount);
    }
}
