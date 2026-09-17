class Solution {
    public int[][] transpose(int[][] matrix) {

       int cols = matrix.length;
int rows= matrix[0].length;

int[][] result = new int[rows][cols];

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        result[i][j] =matrix[j][i] ;
    }
} 
return result;
    }
}