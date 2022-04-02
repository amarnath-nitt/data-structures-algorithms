package main.java.geeksforgeeks.mathematics;

import java.util.List;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public interface PrimeNumber {
    public boolean isPrimeUsingNaiveApproach(long n);
    public boolean isPrimeUsingEfficientApproach(long n);
    public boolean isPrimeUsingMoreEfficientApproach(long n);
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingNaiveApproach(int n);
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingSieveEratosthenesApproach(int n);
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingSieveEratosthenesMoreEfficientApproach(int n);
}
