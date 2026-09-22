class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        List<Character>chars=new ArrayList(freq.keySet());
        Collections.sort(chars,(a,b)->(freq.get(b)-freq.get(a)));
    
    StringBuilder sb=new StringBuilder();
    for(Object c:chars){
        for(int i=0;i<freq.get(c);i++){
            sb.append(c);
        }
    }
    return sb.toString();
}
}