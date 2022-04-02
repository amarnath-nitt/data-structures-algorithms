package main.java.leetcode.array;

import java.util.*;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class ThreeSumImpl implements ThreeSum {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        HashSet<List<Integer>>st = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        int l=1, h=n-1;
        for(int i=0; i<n-2; ){
            if(nums[l]+nums[h] == -nums[i]){
                st.add(new ArrayList<Integer>(Arrays.asList(nums[l],nums[h],nums[i])));
                l++;
                h--;
            }
            else if(nums[l]+nums[h] < -nums[i]){
                l++;
            }
            else if(nums[l]+nums[h] > -nums[i]){
                h--;
            }
            if(l>=h){
                i++;
                l = i+1;
                h = n-1;
            }
        }
        for(List<Integer>list : st){
            res.add(list);
        }
        return res;

    }
}
