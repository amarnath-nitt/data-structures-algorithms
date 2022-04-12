package main.java.leetcode;

import main.java.leetcode.algorithms.GameOfLife;
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
        int [][]board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        GameOfLife gameOfLife = new GameOfLife();
        System.out.println("Before: "+ Arrays.deepToString(board));
        System.out.println("After: " + Arrays.deepToString(gameOfLife.gameOfLife(board)));
    }
}
