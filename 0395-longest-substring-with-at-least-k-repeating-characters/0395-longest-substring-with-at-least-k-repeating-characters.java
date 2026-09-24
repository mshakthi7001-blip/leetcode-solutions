class Solution {
    public int longestSubstring(String s, int k) {
            int n=s.length();
            Map<Character,Integer> freq=new HashMap<>();
            for(char ch:s.toCharArray()){
                freq.put(ch,freq.getOrDefault(ch,0)+1);
            }
            for(char c:freq.keySet()){
                if(freq.get(c)<k){
                    int ml=0;
                    for(String sub:s.split(String.valueOf(c))){
                        ml=Math.max(ml,longestSubstring(sub,k));
                    }
                    return ml;
                }
               
            }
            return n;
    }
}