package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        PowerOfNumber primeNumber    = new PowerOfNumberImpl();
        Object result = primeNumber.getPowerUsingBinaryWithBitsOperatorApproach(12, 2);
        System.out.println("Output: " + result);
    }
}
