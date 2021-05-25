package com.lyw.leetcode.dp.dp002;

import java.util.Arrays;

/**
 * 给定一个未排序的整数数组，找到最长递增子序列的个数。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,4,7]
 * 输出: 2
 * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 * 示例 2:
 *
 * 输入: [2,2,2,2,2]
 * 输出: 5
 * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/dynamic-programming-1-plus/5o6mrv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int length[] = new int[nums.length];
        int count[] = new int[nums.length];
        int maxLength = 1;
        int resultCount = 0;

        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return 1;

        Arrays.fill(length,1);
        count[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    length[i] = Math.max(length[i], length[j] + 1);
                    maxLength = Math.max(maxLength, length[i]);
                }
            }

            for (int k = i - 1; k >= 0; k--) {
                if (nums[i] > nums[k] && length[i] == length[k] + 1) {
                    count[i] += count[k];
                }
            }
            if(count[i] == 0) count[i] =1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (maxLength == length[i]) {
                resultCount += count[i];
            }
        }

        return resultCount;
    }
}
