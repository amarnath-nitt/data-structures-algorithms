package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        AllFactorOfANumber allFactorOfANumber    = new AllFactorOfANumberImpl();
        Object result = allFactorOfANumber.getAllFactorOfANumberUsingMoreEfficientApproach(105);
        System.out.println("Output: " + result);
    }
}
