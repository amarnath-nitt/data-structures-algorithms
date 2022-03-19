package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        LCMOfTwoNumbers lcmOfTwoNumbers = new LCMOfTwoNumbersImpl();
        Object result = lcmOfTwoNumbers.getLcmOfTwoNumbers(12, 20);
        System.out.println("Output: " + result);
    }
}
