package main.java.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class SubArrayWithGivenSumSolutionImpl implements SubArrayWithGivenSumSolution{
    @Override
   public ArrayList<Integer> subarraySum(int[] arr, int n, int target){
        int start=0;
        int currSum=arr[0];
        ArrayList<Integer>res = new ArrayList<>();
        for(int i=1; i<=n; ++i){
            while(currSum > target && start < i-1){
                currSum = currSum - arr[start++];
            }
            if(currSum == target){
                res.add(start+1); res.add(i);
                break;
            }
            else if(i < n){
                currSum += arr[i];
            }
        }
        if(res.size() ==0){
            res.add(-1);
        }
        return res;
   }
}
