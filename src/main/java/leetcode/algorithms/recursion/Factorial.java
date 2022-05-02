package main.java.leetcode.algorithms.recursion;

import java.math.BigInteger;

public class Factorial {
    public static int getFactorial(int n){
        if(n == 0) return 1;
        return n * getFactorial(n-1);
    }
    public static BigInteger getFactorialOfBigNumber(int n){
        BigInteger bigInteger = new BigInteger(String.valueOf(n));
        if(bigInteger.equals(new BigInteger(String.valueOf(0)))) return new BigInteger(String.valueOf(1));
        return new BigInteger(String.valueOf(n)).multiply(getFactorialOfBigNumber(n-1));
    }
}
