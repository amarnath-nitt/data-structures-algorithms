package main.java.leetcode.array;

import java.util.Set;
import java.util.TreeSet;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class RemoveDuplicatesFromSortedArrayImpl implements RemoveDuplicatesFromSortedArray {
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
