package main.java.leetcode.bitmanipulation;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class GrayCodeImpl implements GrayCode{
    @Override
    public int binaryCodeToGrayCode(int num) {
        int res =  num ^ (num >> 1);
        return res;
    }

    @Override
    public int grayCodeToBinaryCode(int num) {
        int mask = num;
        while (mask >0) {
            mask >>= 1;
            num   ^= mask;
        }
        return num;
    }
}
