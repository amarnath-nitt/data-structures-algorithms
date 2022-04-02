package main.java.leetcode.array;

import java.util.HashMap;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class TwoSumImpl implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int [] res = new int[2];
        for(int i=0; i<n; i++){
            if(hm.containsKey(target - nums[i])){
              res[0] = hm.get(target - nums[i]);
              res[1] = i;
              break;
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return res;
    }
}
