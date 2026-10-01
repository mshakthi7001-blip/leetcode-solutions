class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack=new ArrayDeque<>();
        int ans[]=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            int curr=nums[i%nums.length];
            while(!stack.isEmpty()&&curr>=stack.peek()){
                stack.pop();
            } 
            if(i < nums.length)
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(curr);
        }
        return ans;
    }
}