package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        GCDOfTwoNumbers gcdOfTwoNumbers = new GCDOfTwoNumbersImpl();
        Object result = gcdOfTwoNumbers.getGcdNaiveApproach(12, 20);
        System.out.println("Output: " + result);
    }
}
