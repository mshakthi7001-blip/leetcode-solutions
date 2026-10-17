class Solution {
    int val,maxi=0;
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
 while(i<j){
     int val=Math.min(height[i],height[j]) *(j-i);
       maxi=Math.max(val,maxi);
       if(height[i]<height[j])
       i++;
       else
       j--;
    }

   return maxi;
    }
}