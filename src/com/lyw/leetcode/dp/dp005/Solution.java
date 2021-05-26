package com.lyw.leetcode.dp.dp005;

/**
 * 乘积最大子组数
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * 示例 2:
 *
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/dynamic-programming-1-plus/5rmwns/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int maxProduct;
        int[] dp = new int[nums.length];
        int[] dpBottom = new int[nums.length];

        maxProduct = nums[0];
        dp[0] = nums[0];
        dpBottom[0] = nums[0];

        for(int i = 1;i<nums.length;i++){
            dp[i] = Math.max(nums[i],Math.max(nums[i]*dp[i-1],nums[i]*dpBottom[i-1]));
            dpBottom[i] = Math.min(nums[i],Math.min(nums[i]*dp[i-1],nums[i]*dpBottom[i-1]));

            maxProduct = Math.max(maxProduct,dp[i]);
        }
        return maxProduct;
    }
}
