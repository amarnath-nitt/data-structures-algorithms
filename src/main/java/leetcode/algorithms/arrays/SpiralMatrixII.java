package main.java.leetcode.algorithms.arrays;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int [][]matrix = new int[n][n];
        int k = 1;
        int r = 0, c = 0, R = n, C=n;
        while(r<R && c<C){
            for(int i=c; i<C; i++){
                matrix[r][i]= k++;
            }
            r++;
            for(int i=r; i<R; i++){
                matrix[i][C-1]=k++;
            }
            C--;
            if(r < R){
                for(int i=C-1; i>=c; i--){
                    matrix[R-1][i]=k++;
                }
                R--;
            }
            if(c < C){
                for(int i=R-1; i>=r; i--){
                    matrix[i][c]=k++;
                }
                c++;
            }
        }
        return matrix;
    }
}
