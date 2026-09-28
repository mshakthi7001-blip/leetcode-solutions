class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=expand(s,i,i);
            c+=expand(s,i,i+1);
        }return c;

    }
    private int expand(String s,int l,int r){
        int c1=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            c1++;
            l--;
            r++;
        }
        return c1;
    }
}