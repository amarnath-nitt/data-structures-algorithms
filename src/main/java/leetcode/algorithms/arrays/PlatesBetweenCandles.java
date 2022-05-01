package main.java.leetcode.algorithms.arrays;

public class PlatesBetweenCandles {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int []arrRes = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            String str = "" + s.substring(l,r+1);
            int leftInd = str.indexOf('|');
            int rightInd = str.lastIndexOf('|');
            if(Math.abs(rightInd) - Math.abs(leftInd) <=1){
                arrRes[i]= 0;
            }
            else{
                int count=0;
                for(int j=leftInd; j<=rightInd; j++){
                    if(str.charAt(j)=='*'){
                        count++;
                    }
                }
                arrRes[i]=count;
            }
        }
        return arrRes;
    }
}
