package main.java.geeksforgeeks.mathematics;

public class PrimeNumberImpl implements PrimeNumber{
    @Override
    public boolean isPrimeUsingNaiveApproach(int n) {
        if(n == 1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPrimeUsingEfficientApproach(int n) {
        if(n == 1){
            return false;
        }
        for(int i=2; i*i <=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPrimeUsingMoreEfficientApproach(int n) {
        if(n == 1) return false;
        if(n == 2  || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i=5; i*i <= n ; i+=6){
            if(n % i ==0 ){
                return false;
            }
            if(n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
