class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        int maxf=0;
        for(int i=0;i<freq.length;i++){
            maxf=Math.max(freq[i],maxf);
        }
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxf){
                count++;
            }
        }
        int ans=(maxf-1)*(n+1)+count;
return Math.max(tasks.length,ans);
    }
}