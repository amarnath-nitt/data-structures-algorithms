package main.java.geeksforgeeks.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class PrimeNumberImpl implements PrimeNumber{
    @Override
    public boolean isPrimeUsingNaiveApproach(long n) {
        if(n == 1){
            return false;
        }
        for(long i=2; i<n; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPrimeUsingEfficientApproach(long n) {
        if(n == 1){
            return false;
        }
        for(long i=2; i*i <=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPrimeUsingMoreEfficientApproach(long n) {
        if(n == 1) return false;
        if(n == 2  || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(long i=5; i*i <= n ; i+=6){
            if(n % i ==0 ){
                return false;
            }
            if(n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingNaiveApproach(int n) {
        List<Integer> resList = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(isPrimeUsingMoreEfficientApproach(i)){
                resList.add(i);
            }
        }
        return resList;
    }

    @Override
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingSieveEratosthenesApproach(int n) {
        List<Integer> resList = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n+1, true));
        for(int i=2; i*i <=n; i++){
            if(isPrime.get(i)){
                for(int j = i*i; j<=n; j+=i){
                    isPrime.set(j, false);
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(isPrime.get(i)){
                resList.add(i);
            }
        }
        return resList;
    }

    @Override
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingSieveEratosthenesMoreEfficientApproach(int n) {
        List<Integer> resList = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n+1, true));
        for(int i=2; i<=n; i++){
            if(isPrime.get(i)){
                resList.add(i);
                for(int j=i*i; j<=n; j+=i){
                    isPrime.set(j, false);
                }
            }
        }
        return resList;
    }
}
