class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set=new HashSet<>();
      int end=0;
      int start=0;
      int max=0;
      if(s.length()==0){
        return 0;
      }
      while(end<s.length()){
        while(set.contains(s.charAt(end))){
            set.remove(s.charAt(start));
            start++;
        }
        set.add(s.charAt(end));
        end++;
        max=Math.max(max,end-start+1);
      }
      return max-1;
    }
}