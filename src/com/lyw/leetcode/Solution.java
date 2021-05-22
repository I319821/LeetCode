package com.lyw.leetcode;

/**
 * 最长上升子序列
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
 * 例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 *  
 * 示例 1：
 *
 * 输入：nums = [10,9,2,5,3,7,101,18]
 * 输出：4
 * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
 * 示例 2：
 *
 * 输入：nums = [0,1,0,3,2,3]
 * 输出：4
 * 示例 3：
 *
 * 输入：nums = [7,7,7,7,7,7,7]
 * 输出：1
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/dynamic-programming-1-plus/5oqnpg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;

        int[] d = new int[nums.length];
        d[0] = nums[0];
        int length = 1;

        for(int i =1; i<nums.length;i++){
            if(nums[i] < d[length - 1]){

                int start = 1;
                int end = length;
                int mid=0;

                //use binary search to find the correct position
                while(start<=end){
                    mid = (start + end) / 2;
                    if(nums[i] > d[mid-1]){
                        start = mid + 1;
                    }else if(nums[i] < d[mid-1]){
                        end = mid - 1;
                    }else{
                        break;
                    }
                }
                if(nums[i] != d[mid-1]){
                    d[start-1] = nums[i];
                }
            }else if(nums[i] > d[length - 1]){
                d[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
