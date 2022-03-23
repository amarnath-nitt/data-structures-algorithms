package main.java.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrayImpl implements MedianOfTwoSortedArray{
    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> numList = new ArrayList<>();
        Arrays.stream(nums1).forEach(x-> numList.add(x));
        Arrays.stream(nums2).forEach(x-> numList.add(x));
        Collections.sort(numList);
        int n = numList.size();
        double median = 0;
        if(n%2==0){
            median = (numList.get( (n/2) - 1 ) + numList.get(n/2))/2.0;
        }
        else{
            median = numList.get(n/2);
        }
        return median;
    }
}
