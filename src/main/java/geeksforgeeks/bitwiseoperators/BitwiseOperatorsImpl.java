package main.java.geeksforgeeks.bitwiseoperators;

public class BitwiseOperatorsImpl implements BitwiseOperators{
    @Override
    public boolean checkKthBitIsSetUsingRightShift(int n, int k) {
        return ((n >> (k-1)) & 1) != 0;
    }

    @Override
    public boolean checkKthBitIsSetUsingLeftShift(int n, int k) {
        return ((1 << (k-1)) & n) != 0;
    }

    @Override
    public int countSet(int n) {
        int count=0;
        while(n > 0){
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    @Override
    public int countSetUsingBrianKernighamApproach(int n) {
        int count =0;
        while (n > 0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }

    @Override
    public int countSetUsingLookupTable(int n) {
        int [] BitSetTable256 = new int[256];
        BitSetTable256[0] = 0;
        for(int i=1; i<256; i++){
            BitSetTable256[i] = (i & 1) + BitSetTable256[i/2];
        }
        int count = BitSetTable256[n & 0xff] +
                    BitSetTable256[(n >> 8) & 0xff] +
                    BitSetTable256[(n >> 8) & 0xff] +
                    BitSetTable256[(n >> 8) & 0xff];
        return count;
    }

    @Override
    public boolean isPowerOfTwoUsingNaiveApproach(int n) {
        if(n == 0) return false;
        while( n != 1){
            if(n % 2 != 0){
                return false;
            }
            n >>=1;
        }
        return true;
    }

    @Override
    public boolean isPowerOfTwoUsingEfficientApproach(int n) {
        return (n != 0) && ( (n & (n-1)) == 0);
    }
}
