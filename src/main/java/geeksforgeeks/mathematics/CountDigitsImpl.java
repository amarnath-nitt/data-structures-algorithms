package main.java.geeksforgeeks.mathematics;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class CountDigitsImpl implements CountDigits{
    @Override
    public int getDigitCount(int n) {
        int count=0;
        while(n > 0){
            n = n/ 10;
            count++;
        }
        return count;
    }

    @Override
    public int getDigitCountUsingRecursion(int n) {
        if(n ==0){
            return 0;
        }
        return getDigitCountUsingRecursion(n/10) + 1;
    }

    @Override
    public int getDigitCountUsingLogarithmic(int n) {
        return (int) Math.floor(Math.log10(n)+1);
    }
}
