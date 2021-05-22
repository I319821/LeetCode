package com.lyw.leetcode.dp.dp001;

import com.lyw.leetcode.Solution;

public class Main {
    public static void main(String[] args) {
        int[] num = {3,5,6,2,5,4,19,5,6,7,12};
        test(num);

    }

    public static void test(int[] num){
      //  Solution1 solution = new Solution1();
//        Solution2 solution = new Solution2();
 //       Solution3 solution = new Solution3();
        Solution solution = new Solution();
        int length = solution.lengthOfLIS(num);
        System.out.print(length);
    }
}
