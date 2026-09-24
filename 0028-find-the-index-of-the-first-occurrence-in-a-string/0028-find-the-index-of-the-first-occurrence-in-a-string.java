class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        for (int i = 0; i <= n - m; i++) {
        int j = 0;
        int o=i;
        while (j < m && haystack.charAt(o)== needle.charAt(j)) {
            j++;
            o++;
        }

        if (j == m)
            return i;
    }

    return -1;
    }
}