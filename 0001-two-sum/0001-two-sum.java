class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map=new HashMap<>();
int i=0;
int res=0;
int[] arr= new int[nums.length];
while(i<nums.length){
res=target-nums[i];
if(map.containsKey(res)){
    return new int[]{map.get(res),i};
}
else{
    map.put(nums[i],i);
}
i++;
}
return new int[]{};
    }
}