package com.lyw.leetcode.offer.offer05;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
class Solution {
    public String replaceSpace(String s) {
        StringBuffer res = new StringBuffer("");
        for(int i = 0; i < s.length(); i++ ){
            if(s.charAt(i) == ' '){
                res.append("%20");
            }else{
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}