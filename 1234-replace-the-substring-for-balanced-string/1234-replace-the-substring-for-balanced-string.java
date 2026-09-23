class Solution {
    public int balancedString(String s) {
        int[] freq=new int[128];
        int n=s.length();
        int req=n/4;
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        int left=0;
        int ans=n;
        for(int right=0;right<n;right++){
            freq[s.charAt(right)]--;
            while(left<n&&freq['Q']<=req&&freq['W']<=req&&freq['E']<=req&&freq['R']<=req){
                ans=Math.min(ans,right-left+1);
                freq[s.charAt(left)]++;
                left++;
        }
    }
    return ans;
    }
}