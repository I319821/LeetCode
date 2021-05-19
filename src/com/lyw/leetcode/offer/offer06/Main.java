package com.lyw.leetcode.offer.offer06;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);

        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        test(node1);
    }

    public static void test(ListNode head){

        long begin;
        long end;
        int[] result;

        begin = System.currentTimeMillis();
        Solution solution = new Solution();
        result = solution.reversePrint(head);
        end = System.currentTimeMillis();

        System.out.println("output=" + result);
        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }

}
