package main.java.leetcode.algorithms;

public class GameOfLife {
    public int [][] gameOfLife(int[][] board) {
        int n = board.length; int m = board[0].length;
        int [][] resList = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int liveCount = 0;
                if(i>0 && board[i-1][j] == 1){
                    liveCount++;
                }
                if(i<n-1 && board[i+1][j] == 1){
                    liveCount++;
                }
                if(j>0 && board[i][j-1] == 1){
                    liveCount++;
                }
                if(j<m-1 && board[i][j+1] == 1){
                    liveCount++;
                }

                if(i>0 && j>0 && board[i-1][j-1] == 1){
                    liveCount++;
                }
                if(i>0 && j<m-1 && board[i-1][j+1] == 1){
                    liveCount++;
                }
                if(j>0 && i<n-1 && board[i+1][j-1] == 1){
                    liveCount++;
                }
                if(j<m-1 && i<n-1 && board[i+1][j+1] == 1){
                    liveCount++;
                }
                if(board[i][j] == 1 && liveCount < 2){
                    resList[i][j] = 0;
                }
                else if(board[i][j] == 1 &&  (liveCount == 2 || liveCount == 3) ){
                    resList[i][j] = 1;
                }
                else if(board[i][j] == 1 && liveCount > 3){
                    resList[i][j] = 0;
                }
                else if(board[i][j] == 0 && liveCount == 3){
                    resList[i][j] = 1;
                }
                else{
                    resList[i][j] = board[i][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j] = resList[i][j];
            }
        }
        return resList;
    }
}
