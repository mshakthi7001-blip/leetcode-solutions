class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bot=m-1;
        List<Integer> a=new ArrayList<>();
        while(left<=right&&top<=bot){
            for(int i=left;i<=right;i++){
            a.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                a.add(matrix[i][right]);
            }
            right--;
            if(top<=bot){
            for(int i=right;i>=left;i--){
                a.add(matrix[bot][i]);
            }
            bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    a.add(matrix[i][left]);
                }
                left++;
            }
        }
        return a;
    }
}