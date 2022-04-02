package main.java.geeksforgeeks.mathematics;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class LCMOfTwoNumbersImpl implements LCMOfTwoNumbers{
    GCDOfTwoNumbers gcdOfTwoNumbers = new GCDOfTwoNumbersImpl();

    @Override
    public long getLcmOfTwoNumbers(int a, int b) {
        return (a * b) / gcdOfTwoNumbers.getGcdUsingRecursion(a, b);
    }
}
