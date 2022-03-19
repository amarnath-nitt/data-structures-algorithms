package main.java.geeksforgeeks.mathematics;

public class PalindromeNumberImpl implements PalindromeNumber{
    @Override
    public boolean isPalindromeNumber(int n) {
        int rev=0;
        int temp=n;
        while(n > 0){
            int r = n % 10;
            rev = rev * 10 + r;
            n = n /10;
        }
        return rev == temp;
    }
}
