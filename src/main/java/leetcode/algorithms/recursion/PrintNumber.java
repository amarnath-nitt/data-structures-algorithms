package main.java.leetcode.algorithms.recursion;

public class PrintNumber {
    public static void printLinearlyFrom1ToN(int i, int n){
        if(i > n) return ;
        System.out.println(i);
        printLinearlyFrom1ToN(i+1, n);
    }

}
