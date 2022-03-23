package main.java.leetcode.array;

public class ContainerWithMostWaterImpl implements ContainerWithMostWater {
    @Override
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0, h=n-1;
        int maxWater=0;
        while(l<h){
            if(height[l]>height[h]){
                maxWater = Math.max(maxWater, (h-l)*height[h]);
                h--;
            }
            else{
                maxWater = Math.max(maxWater, (h-l)*height[l]);
                l++;
            }
        }
        return maxWater;
    }
}
