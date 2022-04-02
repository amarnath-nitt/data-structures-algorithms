package main.java.geeksforgeeks.mathematics;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class SwapTwoNumbersImpl implements SwapTwoNumbers{
    @Override
    public void usingAdditionSubtraction(int a, int b) {
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println(a + ", " + b);
    }

    @Override
    public void usingMultiplicationDivide(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(a + ", " + b);
    }

    @Override
    public void usingXorOperator(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + ", " + b);
    }
}
