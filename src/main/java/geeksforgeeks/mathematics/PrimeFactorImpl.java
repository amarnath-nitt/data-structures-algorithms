package main.java.geeksforgeeks.mathematics;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorImpl implements PrimeFactor{
    PrimeNumber primeNumber = new PrimeNumberImpl();
    @Override
    public List<Long> getPrimeFactorUsingNaiveApproach(long n) {
        List<Long> resList = new ArrayList<>();
        if(n == 1){
            return resList;
        }
        for(long i=2; i<=n; i++){
            if(primeNumber.isPrimeUsingMoreEfficientApproach(i)){
                long x = i;
                while(n % x == 0){
                    resList.add(i);
                    x = x * x;
                }
            }
        }
        return resList;
    }

    @Override
    public List<Long> getPrimeFactorUsingEfficientApproach(long n) {
        List<Long> resList = new ArrayList<>();
        if(n <=1 ){
            return resList;
        }
        for(long i=2; i*i <=n; i++){
            while(n % i ==0 ){
                resList.add(i);
                n = n/i;
            }
        }
        if(n > 1){
            resList.add(n);
        }
        return resList;
    }

    @Override
    public List<Long> getPrimeFactorUsingMoreEfficientApproach(long n) {
        List<Long> resList = new ArrayList<>();
        if(n <=1 ){
            return resList;
        }
        while(n % 2 ==0){
            resList.add(new Long(2));
            n = n/2;
        }
        while(n % 3 ==0 ){
            resList.add(new Long(3));
            n = n/3;
        }
        for(long i=5; i*i <=n; i+=6){
            while(n % i ==0){
                resList.add(i);
                n = n/i;
            }
            while(n % (i+2) == 0){
                resList.add((i+2));
                n = n / (i+2);
            }
        }
        if(n > 3){
            resList.add(n);
        }
        return resList;
    }
}
