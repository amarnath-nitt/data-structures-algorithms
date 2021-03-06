package main.java.geeksforgeeks.mathematics;

import java.math.BigInteger;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class FactorialOfANumberImpl implements FactorialOfANumber{
    protected final long mod = (long) (Math.pow(10, 9) + 7);

    @Override
    public long getFactorialOfNumber(int n) {
        long res = 1;
        for(int i=2; i<=n; i++){
            res = res * i;
        }
        return res;
    }

    @Override
    public BigInteger getFactorialOfNumberUsingBigInteger(long n) {
        BigInteger bigInteger = BigInteger.valueOf(1);
        for(long i=2; i<=n; i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i)) ;
        }
        return bigInteger;
    }

    @Override
    public long getFactorialOfNumberUsingModular(long n) {
        long res= 1;
        for(long i=2; i<=n; i++){
            res = (res * i) % mod;
        }
        return res;
    }

    @Override
    public long getFactorialOfNumberUsingRecursion(long n) {
        if(n <=1){
            return n;
        }
        return (n * getFactorialOfNumberUsingRecursion(n-1));
    }
}
