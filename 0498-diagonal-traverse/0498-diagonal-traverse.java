class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];
       int r=0,c=0,i=0;
        boolean up=true;
        while(i<m*n){
            arr[i++]=mat[r][c];
            if(up){
                if(c==n-1){
                    r++;
                    up=false;
                }
                else if(r==0){
                    c++;
                    up=false;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    c++;
                    up=true;
                }
                else if(c==0){
                    r++;
                    up=true;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return arr;
    }
}