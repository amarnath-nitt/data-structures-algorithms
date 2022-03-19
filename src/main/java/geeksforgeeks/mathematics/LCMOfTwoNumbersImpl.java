package main.java.geeksforgeeks.mathematics;

public class LCMOfTwoNumbersImpl implements LCMOfTwoNumbers{
    GCDOfTwoNumbers gcdOfTwoNumbers = new GCDOfTwoNumbersImpl();

    @Override
    public long getLcmOfTwoNumbers(int a, int b) {
        return (a * b) / gcdOfTwoNumbers.getGcdUsingRecursion(a, b);
    }
}
