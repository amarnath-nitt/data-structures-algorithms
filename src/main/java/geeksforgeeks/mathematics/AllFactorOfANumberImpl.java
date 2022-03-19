package main.java.geeksforgeeks.mathematics;

import java.util.ArrayList;
import java.util.List;

public class AllFactorOfANumberImpl implements AllFactorOfANumber{
    @Override
    public List<Long> getAllFactorOfANumberUsingNaiveApproach(long n) {
        List<Long> resList = new ArrayList<>();
        for(long i=1; i<=n; i++){
            if(n % i ==0 ){
                resList.add(i);
            }
        }
        return resList;
    }

    @Override
    public List<Long> getAllFactorOfANumberUsingEfficientApproach(long n) {
        List<Long> resList = new ArrayList<>();
        for(long i=1; i*i <=n; i++){
            if(n % i == 0){
                resList.add(i);
                if( n / i != i){
                    resList.add(n/i);
                }
            }
        }
        return resList;
    }

    @Override
    public List<Long> getAllFactorOfANumberUsingMoreEfficientApproach(long n) {
        List<Long> resList = new ArrayList<>();
        long i=1;
        for(; i*i <=n; i++){
            if(n % i ==0){
                resList.add(i);
            }
        }
        for(; i>=1; i--){
            if(n % i == 0){
                resList.add(n/i);
            }
        }
        return resList;
    }
}
