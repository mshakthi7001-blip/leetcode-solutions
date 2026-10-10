class Solution {
    public static boolean canplace(char[][] board,int row,int col,int num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
            if(board[i][col]==num){
                return false;
            }
            int boxrow=3*(row/3)+i/3;
            int boxcol=3*(col/3)+i%3;
            if(board[boxrow][boxcol]==num){
                return false;
            }
        }
        return true;
    }
    public static boolean solve(char[][] board){
        //find an empty cell 
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char num='1';num<='9';num++){
                        if(canplace(board,row,col,num)){
                            board[row][col]=num;
                            //exploring the board
                            if(solve(board)){
                                return true;//if solved return true
                            }
                            //undo/backtracking
                            board[row][col]='.';
                        }
                    }return false;// can't fix any numbers upto 1 to 9
                }
            }

        } return true;
       
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}