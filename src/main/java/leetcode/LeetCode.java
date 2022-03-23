package main.java.leetcode;

import main.java.leetcode.array.ThreeSum;
import main.java.leetcode.array.ThreeSumImpl;
import main.java.leetcode.bitmanipulation.GrayCode;
import main.java.leetcode.bitmanipulation.GrayCodeImpl;

public class LeetCode {
    public static void main(String [] args){
        GrayCode grayCode = new GrayCodeImpl();
        System.out.println(grayCode.grayCodeToBinaryCode(112));
    }
}
