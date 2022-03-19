package main.java.geeksforgeeks.mathematics;

import java.util.List;

public interface PrimeNumber {
    public boolean isPrimeUsingNaiveApproach(long n);
    public boolean isPrimeUsingEfficientApproach(long n);
    public boolean isPrimeUsingMoreEfficientApproach(long n);
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingNaiveApproach(int n);
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingSieveEratosthenesApproach(int n);
    public List<Integer> getPrimeNumberLessThanGivenNumberUsingSieveEratosthenesMoreEfficientApproach(int n);
}
