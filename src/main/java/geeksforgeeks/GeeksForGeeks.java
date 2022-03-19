package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        PrimeFactor primeFactor    = new PrimeFactorImpl();
        Object result = primeFactor.getPrimeFactorUsingMoreEfficientApproach(105);
        System.out.println("Output: " + result);
    }
}
