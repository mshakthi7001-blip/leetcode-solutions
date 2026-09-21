class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] fs=new int[256];
        int[] ft=new int[256];
        for (int i=0;i<s.length();i++) {
          char a=s.charAt(i);
          char b=t.charAt(i);
          if(fs[a]!=ft[b])
          return false;
          fs[a]=i+1;
          ft[b]=i+1;
        }
        return true;
    }
}