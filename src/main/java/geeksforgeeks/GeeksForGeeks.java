package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.CountDigits;
import main.java.geeksforgeeks.mathematics.CountDigitsImpl;
import main.java.geeksforgeeks.mathematics.SwapTwoNumbers;
import main.java.geeksforgeeks.mathematics.SwapTwoNumbersImpl;

public class GeeksForGeeks {
    public static void main(String []args){
        CountDigits countDigits = new CountDigitsImpl();
        Object result = countDigits.getDigitCountUsingRecursion(10001);
        System.out.println("Output: " + result);
    }
}
