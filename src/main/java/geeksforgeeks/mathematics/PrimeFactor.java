package main.java.geeksforgeeks.mathematics;

import java.util.List;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public interface PrimeFactor {
    public List<Long> getPrimeFactorUsingNaiveApproach(long n);
    public List<Long> getPrimeFactorUsingEfficientApproach(long n);
    public List<Long> getPrimeFactorUsingMoreEfficientApproach(long n);
}
