package main.java.leetcode.algorithms.recursion;

public class PrintName {
    public static void printNTimes(int i, int n){
        if( i > n) return ;
        System.out.println("Amarnath");
        printNTimes(i+1, n);
    }
}
