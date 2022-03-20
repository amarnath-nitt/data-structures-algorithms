package main.java.geeksforgeeks;

import main.java.geeksforgeeks.bitwiseoperators.BitwiseOperators;
import main.java.geeksforgeeks.bitwiseoperators.BitwiseOperatorsImpl;
import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        BitwiseOperators bitwiseOperators    = new BitwiseOperatorsImpl();
        Object result = bitwiseOperators.isPowerOfTwoUsingEfficientApproach(6);
        System.out.println("Output: " + result);
    }
}
