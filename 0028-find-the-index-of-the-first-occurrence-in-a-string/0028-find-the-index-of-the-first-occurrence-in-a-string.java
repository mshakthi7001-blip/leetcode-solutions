class Solution {
    public static int[] buildlps(String s){
        int n=s.length();
        int[] arr= new int[n];
        int i=1;
        int len=0;
        while(i<n){
        if(s.charAt(i)==s.charAt(len)){
            len++;
            arr[i]=len;
            i++;
        }
        else if(len>0){
            len=arr[len-1];
        }
        else{
            i++;
        }
        }
        return arr;
    }
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        int[] lps=buildlps(needle);
        int i=0;
        int j=0;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                 if(j==m)
            return i-j;
            }
            else if(j>0){
                j=lps[j-1];
            }
           else{
            i++;
           }
        }
return -1;
    }
}