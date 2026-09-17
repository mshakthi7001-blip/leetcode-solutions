class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] l = new int[m];
        int[] k = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    l[i] = 1;
                    k[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (l[i]==1| k[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
