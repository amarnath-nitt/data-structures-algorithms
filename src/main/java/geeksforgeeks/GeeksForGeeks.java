package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        FactorialOfANumber factorialOfANumber = new FactorialOfANumberImpl();
        Object result = factorialOfANumber.getFactorialOfNumberUsingModular(10000);
        System.out.println("Output: " + result);
    }
}
