class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int[] prefix=new int[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<prefix.length-1;i++){
            prefix[i+1]=prefix[i]+nums[i];       
        }
       int[] q=new int[nums.length+1];
       int head=0,tail=0;
       int ans=nums.length+1;
       for(int i=0;i<=nums.length;i++){
        while(head<tail && prefix[i]-prefix[q[head]]>=k){
            ans=Math.min(ans,i-q[head]);
            head++;
        }
        while(head<tail && prefix[i]<=prefix[q[tail-1]]){
            tail--;
        }
        q[tail]=i;
        tail++;
       }
       return ans==nums.length+1?-1:ans;

    }
}