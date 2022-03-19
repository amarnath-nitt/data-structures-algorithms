package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        PrimeNumber primeNumber    = new PrimeNumberImpl();
        Object result = primeNumber.isPrimeUsingEfficientApproach(5);
        System.out.println("Output: " + result);
    }
}
