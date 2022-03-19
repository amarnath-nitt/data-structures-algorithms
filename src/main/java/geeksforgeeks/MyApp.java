package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.SwapTwoNumbers;
import main.java.geeksforgeeks.mathematics.SwapTwoNumbersImpl;

public class MyApp {
    public static void main(String []args){
        SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbersImpl();
        swapTwoNumbers.usingXorOperator(0, 20);
    }
}
