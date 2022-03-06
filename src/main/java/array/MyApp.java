package main.java.array;

import main.java.array.solutions.*;

import java.util.*;

public class MyApp {
    public static void main(String [] args){
        int [] num1 = {-1,8,6,-2,5,-4,8,3,7};
        int [] num2 = {1,4};
        int target = 9;
        ThreeSumSolution medianOfTwoSortedArray = new ThreeSumSolutionImpl();
        System.out.println(medianOfTwoSortedArray.threeSum(num1));
    }
}
