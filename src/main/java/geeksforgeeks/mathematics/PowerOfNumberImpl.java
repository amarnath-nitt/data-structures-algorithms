package main.java.geeksforgeeks.mathematics;

public class PowerOfNumberImpl implements PowerOfNumber{
    @Override
    public long getPowerUsingNaiveApproach(int x, int n) {
        long res = 1;
        for(int i=1; i<=n; i++){
            res = res * x;
        }
        return res;
    }

    @Override
    public long getPowerUsingEfficientApproach(int x, int n) {
        if(n == 0){
            return 1;
        }
        long temp = getPowerUsingEfficientApproach(x, n/2);
        temp  = temp * temp;
        if(n % 2 !=0){
            return temp * x;
        }
        else{
            return temp;
        }
    }

    @Override
    public long getPowerUsingBinaryApproach(int x, int n) {
        long res = 1;
        while(n > 0){
            if(n % 2 !=0){
                res = res * x;
            }
            x = x * x;
            n  = n/2;
        }
        return res;
    }

    @Override
    public long getPowerUsingBinaryWithBitsOperatorApproach(int x, int n) {
        long res = 1;
        while ( n > 0){
            if( (n & 1) == 1){
               res = res * x;
            }
            x = x * x;
            n >>=1;
        }
        return res;
    }
}
