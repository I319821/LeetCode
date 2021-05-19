package com.lyw.leetcode.offer.offer05;

public class Main {
    public static void main(String[] args) {
        String[] ss = { "We are happy"};

        test(ss);
    }

    public static void test(String[] input){

        long begin;
        String result;
        long end;
        Solution solution = new Solution();
        for(String s:input){
            begin = System.currentTimeMillis();
            result = solution.replaceSpace(s);
            end = System.currentTimeMillis();
            System.out.println(input + ":	output=" + result);
            System.out.println();
            System.out.println("耗时：" + (end - begin) + "ms");
            System.out.println("-------------------");
        }
    }
}
