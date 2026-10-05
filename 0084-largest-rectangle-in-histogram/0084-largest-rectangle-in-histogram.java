class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Deque<Integer> st= new ArrayDeque<>();
        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:heights[i];
            while(!st.isEmpty()&& heights[st.peek()]>=curr){
                int h=heights[st.pop()];
                int pse =st.isEmpty()?-1:st.peek();
                int nse=i;
                int w=nse-pse-1;
                max=Math.max(max,h*w);
            }
            if(i<n) st.push(i);
        }
        return max;
    }

}