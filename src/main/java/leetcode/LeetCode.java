package main.java.leetcode;

import main.java.leetcode.algorithms.GameOfLife;
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
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
        System.out.println("Spiral Matrix: " + Arrays.deepToString(spiralMatrixII.generateMatrix(10)));
    }
}
