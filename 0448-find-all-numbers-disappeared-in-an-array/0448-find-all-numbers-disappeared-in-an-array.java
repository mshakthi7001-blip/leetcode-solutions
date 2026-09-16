class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList <>();
        int[] an=new int[nums.length+1];
        for(int num:nums){
            an[num]++;
        }
        for(int i=1;i<an.length;i++){
            if(an[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}