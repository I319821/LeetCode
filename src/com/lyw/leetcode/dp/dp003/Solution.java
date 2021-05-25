package com.lyw.leetcode.dp.dp003;

import java.util.Arrays;

/**
 * 给你一个二维整数数组 envelopes ，其中 envelopes[i] = [wi, hi] ，表示第 i 个信封的宽度和高度。
 *
 * 当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 *
 * 请计算 最多能有多少个 信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 *
 * 注意：不允许旋转信封。
 *
 *  
 * 示例 1：
 *
 * 输入：envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * 输出：3
 * 解释：最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
 * 示例 2：
 *
 * 输入：envelopes = [[1,1],[1,1],[1,1]]
 * 输出：1
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/dynamic-programming-1-plus/5okoej/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0)
            return 0;

        if (envelopes.length == 1)
            return 1;

        sortEnvelopes(envelopes);

        return findMaxCountEnvelopes(envelopes);

    }

    public void sortEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });
    }

    public int findMaxCountEnvelopes(int[][] envelopes) {
        int[] heights = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            heights[i] = envelopes[i][1];
        }
        return findLISOfHeights(heights);
    }

    public int findLISOfHeights(int[] heights) {
        int[] dp = new int[heights.length];
        int maxLength = 0;

        for (int height : heights) {
            int i = Arrays.binarySearch(dp, 0, maxLength, height);
            if (i < 0) {
                i = -(i+1);
            }
            dp[i] = height;
            if(i==maxLength){
                maxLength ++;
            }
        }

        return maxLength;
    }
}
