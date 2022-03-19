package main.java.geeksforgeeks;

import main.java.geeksforgeeks.mathematics.*;

public class GeeksForGeeks {
    public static void main(String []args){
        PalindromeNumber palindromeNumber = new PalindromeNumberImpl();
        Object result = palindromeNumber.isPalindromeNumber(100011);
        System.out.println("Output: " + result);
    }
}
