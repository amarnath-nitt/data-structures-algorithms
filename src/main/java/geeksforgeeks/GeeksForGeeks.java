package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        TrailZeroInFactorial trailZeroInFactorial = new TrailZeroInFactorialImpl();
        Object result = trailZeroInFactorial.getCountZero(120);
        System.out.println("Output: " + result);
    }
}
