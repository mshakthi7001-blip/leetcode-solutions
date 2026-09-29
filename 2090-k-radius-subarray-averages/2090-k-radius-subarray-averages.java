class Solution {
    public int[] getAverages(int[] nums, int k) {
        long sum=0;
        int[] arr=new int[nums.length];
         Arrays.fill(arr, -1);
        if(k==0){
            return nums;
        }
        if (2 * k + 1 > nums.length) {
    Arrays.fill(arr, -1);
    return arr;
}
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
        }
        for(int i=k;i<nums.length-k;i++){
            arr[i]=(int)(sum/(2*k+1));
            if(i < nums.length-k-1)
            sum=sum-nums[i-k]+nums[i+k+1];
        }
        return arr;
    }
}