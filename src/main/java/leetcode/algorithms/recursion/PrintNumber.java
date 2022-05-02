package main.java.leetcode.algorithms.recursion;

public class PrintNumber {
    public static void printLinearlyFrom1ToN(int i, int n){
        if(i > n) return ;
        System.out.println(i);
        printLinearlyFrom1ToN(i+1, n);
    }
    public static void printLinearlyFrom1ToN(int n){
        if( n < 1) return ;
        printLinearlyFrom1ToN( n -1 );
        System.out.println(n);
    }
    public static void printFromNTo1(int n){
        if(n<1) return ;
        System.out.println(n);
        printFromNTo1(n-1);
    }

}
