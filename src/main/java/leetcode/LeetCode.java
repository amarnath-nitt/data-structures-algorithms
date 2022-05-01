package main.java.leetcode;

import main.java.leetcode.algorithms.GameOfLife;
import main.java.leetcode.algorithms.PlatesBetweenCandles;
import main.java.leetcode.algorithms.SpiralMatrixII;
import main.java.leetcode.array.ThreeSum;
import main.java.leetcode.array.ThreeSumImpl;
import main.java.leetcode.bitmanipulation.GrayCode;
import main.java.leetcode.bitmanipulation.GrayCodeImpl;

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
