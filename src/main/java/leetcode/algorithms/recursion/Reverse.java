package main.java.leetcode.algorithms.recursion;

public class Reverse {
    public static int [] reverseArray(int []arr, int n){
        return reverseArrayUsingSinglePointer(0, arr, n);
    }
    public static int [] reverseArrayUsingSinglePointer(int i, int []arr, int n){
        if(i >= n/2){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[(n-i-1)];
        arr[(n-i-1)] = temp;
        return reverseArrayUsingSinglePointer(i+1, arr, n);
    }
}
