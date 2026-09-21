class Solution {
    public int reverseDegree(String s) {
        char[] a=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=((('z'-a[i])+1)*(i+1));
        }
        return sum;
    }
}