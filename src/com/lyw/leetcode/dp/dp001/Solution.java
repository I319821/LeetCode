package com.lyw.leetcode.dp.dp001;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        List<TempResult> tempResultList = new ArrayList<>();

        int wholeMaxLength = 0;
        for (int i = 1; i <= nums.length; i++) {
            int currentMaxLength = calLengthOfLIS(nums, i, tempResultList);
            tempResultList.add(new TempResult(nums[i-1],currentMaxLength));
            wholeMaxLength = wholeMaxLength > currentMaxLength ? wholeMaxLength : currentMaxLength;
        }
        return wholeMaxLength;
    }

    public int calLengthOfLIS(int[] nums, int currentNumLength, List<TempResult> tempResultList) {

        if (tempResultList == null) {
            tempResultList = new ArrayList<>();
        }

        if (currentNumLength == 0) {
            return 0;
        } else if (currentNumLength == 1) {
            return 1;
        } else {

            int maxLength = 0;
            int currentMaxLength = 0;
            int resultNum = tempResultList.size();
            for (int i = 0;i<resultNum;i++) {
                TempResult tempResult = tempResultList.get(i);
                if (nums[currentNumLength - 1] > tempResult.getLastElement()) {
                    currentMaxLength = tempResult.getLastMaxLength() + 1;

                } else if (nums[currentNumLength - 1] < tempResult.getLastElement()) {
                    currentMaxLength = 1;

                }
                maxLength = (currentMaxLength > maxLength) ? currentMaxLength:maxLength;
            }

            return maxLength;
        }
    }
}

class TempResult {
    private int lastElement;
    private int lastMaxLength;

    TempResult(int lastElement, int lastMaxLength) {
        this.lastElement = lastElement;
        this.lastMaxLength = lastMaxLength;
    }

    public int getLastElement() {
        return lastElement;
    }

    public void setLastElement(int lastElement) {
        this.lastElement = lastElement;
    }

    public int getLastMaxLength() {
        return lastMaxLength;
    }

    public void setLastMaxLength(int lastMaxLength) {
        this.lastMaxLength = lastMaxLength;
    }
}
