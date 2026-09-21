class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int rem=(int)(totalsum%p);
        if(rem==0) return 0;
        HashMap<Integer,Integer> prefixmod=new HashMap<>();
        prefixmod.put(0,-1);
        long prefixsum=0;
        int minlen=nums.length;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int currentmod=(int)(prefixsum%p);
            int targetmod=(currentmod-rem+p)%p;
            if(prefixmod.containsKey(targetmod))
            {
                minlen=Math.min(minlen,i-prefixmod.get(targetmod));
            }
            prefixmod.put(currentmod,i);
        }
        return minlen==nums.length?-1:minlen;
    }
}