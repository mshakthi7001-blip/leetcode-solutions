class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList <>();
        int i=0;
        while(i<nums.length){
           int s=nums[i]-1;
            if(nums[i]!=nums[s]){
                int temp=nums[i];
                nums[i]=nums[s];
                nums[s]=temp;
            }
            else
            i++;
        }
        for(int j=0;j<nums.length;j++){
            if(j+1!=nums[j]){
                res.add(nums[j]);
            }
        }
        return res;
    }
}