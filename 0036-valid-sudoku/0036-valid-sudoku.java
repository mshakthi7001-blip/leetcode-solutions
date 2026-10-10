class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int row=i;
                int col=j;
                char num=board[i][j];
                if (num == '.') {
                    continue;
                }
                for(int k=0;k<9;k++){
                if(k != j &&board[row][k]==num){
                    return false;
                }
                if(k != i &&board[k][col]==num){
                    return false;
                }
                int boxrow=3*(row/3)+k/3;
                int boxcol=3*(col/3)+k%3;
                if((boxrow != i || boxcol != j)
                            &&board[boxrow][boxcol]==num){
                    return false;
                }
            }
        }
        }
        return true;
    }
}