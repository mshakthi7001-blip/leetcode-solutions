class Solution {
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            return f(0,s,dp)-1;
    }
    int f(int index, String s, int[] dp) {
        if (index == s.length()) {
           return 0;
        }
        if(dp[index]!=-1)
        return dp[index];
        int minpartitions=Integer.MAX_VALUE;
        for (int i = index; i < s.length(); i++) {
            if (ispalindrome(s, index, i)) {
               int partitions=1+f(i+1,s,dp);
               minpartitions=Math.min(minpartitions,partitions);
            }
        }
        return dp[index]=minpartitions;
    }

    boolean ispalindrome(String s, int left, int right) {
        while (left <=right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}