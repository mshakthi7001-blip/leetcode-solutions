class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
         Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove index that is outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            // Once first window is complete
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}