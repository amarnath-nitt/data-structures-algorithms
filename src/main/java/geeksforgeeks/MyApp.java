package main.java.geeksforgeeks;

import main.java.geeksforgeeks.array.SubArrayWithGivenSumSolution;
import main.java.geeksforgeeks.array.SubArrayWithGivenSumSolutionImpl;

public class MyApp {
    public static void main(String []args){
        SubArrayWithGivenSumSolution subArrayWithGivenSumSolution = new SubArrayWithGivenSumSolutionImpl();
        System.out.println(subArrayWithGivenSumSolution.subarraySum(new int[]{15, 2, 4, 8, 9, 5, 10, 23}, 8, 23));
    }
}
