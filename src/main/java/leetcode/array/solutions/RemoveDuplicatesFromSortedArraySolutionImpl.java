package main.java.leetcode.array.solutions;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArraySolutionImpl implements RemoveDuplicatesFromSortedArraySolution {
    @Override
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new TreeSet<>();
        for (Integer x : nums) {
            st.add(x);
        }
        int i = 0;
        for (Integer x : st) {
            nums[i++] = x;
        }
        return st.size();
    }
}
