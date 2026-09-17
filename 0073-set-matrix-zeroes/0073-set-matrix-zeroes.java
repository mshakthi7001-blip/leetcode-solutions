class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] l=new boolean[m];
        boolean[] k=new boolean[n];
for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
        if(matrix[i][j]==0){
             l[i]=true;
             k[j]=true;
        }
    }
}
for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
        if(l[i]|k[j]){
            matrix[i][j]=0;
    }
}
        }
    }

}
