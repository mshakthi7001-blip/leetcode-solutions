class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res =new ArrayList<>();
        int[] a=new int[nums.length+1];
        for(int num:nums){
            a[num]++;
        }
        for(int i=0;i<=nums.length;i++){
            if(a[i]==2){
                res.add(i);
            }
        }
return res;
    }
}