class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        char[] a=s.toCharArray();
        for(int i=0;i<=s.length()-3;i++){
             if (a[i] != a[i + 1] &&
                a[i] != a[i + 2] &&
                a[i + 1] != a[i + 2]) {
                count++;
            }
        }
        return count;
    }
}