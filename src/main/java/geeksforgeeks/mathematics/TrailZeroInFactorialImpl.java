package main.java.geeksforgeeks.mathematics;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class TrailZeroInFactorialImpl implements TrailZeroInFactorial{
    @Override
    public long getCountZero(long n) {
        long res= 0;
        for(long i=5; i<=n; i = i*5){
            res = res + n/ i;
        }
        return res;
    }
}
