package main.java.geeksforgeeks.bitwiseoperators;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public interface BitwiseOperators {
    public boolean checkKthBitIsSetUsingRightShift(int n, int k);
    public boolean checkKthBitIsSetUsingLeftShift(int n, int k);
    public int countSet(int n);
    public int countSetUsingBrianKernighamApproach(int n);
    public int countSetUsingLookupTable(int n);
    public boolean isPowerOfTwoUsingNaiveApproach(int n);
    public boolean isPowerOfTwoUsingEfficientApproach(int n);
}
