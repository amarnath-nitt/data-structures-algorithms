package main.java.leetcode;

import main.java.leetcode.algorithms.arrays.PlatesBetweenCandles;

import java.util.Arrays;

/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class LeetCode {
    public static void main(String [] args){
        String inputString = "***|**|*****|**||**|*";
        int [][]queries = new int[][]{{1,17},{4,5},{14,17},{5,11},{15,16}};
        PlatesBetweenCandles platesBetweenCandles = new PlatesBetweenCandles();
        System.out.println("Spiral Matrix: " + Arrays.toString(platesBetweenCandles.platesBetweenCandles(inputString, queries)));
    }
}
