package main.java.leetcode.algorithms.recursion;

public class PrintNumber {
    public static void printNumberFrom0ToN(int n){
        if(n < 0) return;
        printNumberFrom0ToN(n-1);
        System.out.println(n);
    }

}
