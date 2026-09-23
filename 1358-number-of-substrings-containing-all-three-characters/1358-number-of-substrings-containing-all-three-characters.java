class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int[] last={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            int in=s.charAt(i)-'a';
            last[in]=i;
            int min=Math.min(last[0],Math.min(last[1],last[2]));
            ans+=(min+1);
        }
        return ans;
    }
}