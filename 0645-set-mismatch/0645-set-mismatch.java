class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}