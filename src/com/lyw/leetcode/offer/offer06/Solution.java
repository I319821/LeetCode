package com.lyw.leetcode.offer.offer06;

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class Solution {

    public int[] reversePrint(ListNode head) {

        Stack nodeStack = new Stack<Integer>();

        ListNode current = head;
        while (current != null) {
            nodeStack.push(current.val);
            current = current.next;
        }

        int[] result = new int[nodeStack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(nodeStack.pop().toString());
        }

        return result;
    }
}

