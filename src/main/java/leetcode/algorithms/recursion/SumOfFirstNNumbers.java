package main.java.leetcode.algorithms.recursion;

public class SumOfFirstNNumbers {
    public static int getSum(int n){
        if( n == 0) return 0;
        return n + getSum(n-1);
    }
    public static int getSum(int n, int sum){
        if(n < 1){
            return sum;
        }
        return getSum(n - 1, sum + n);
    }
}
