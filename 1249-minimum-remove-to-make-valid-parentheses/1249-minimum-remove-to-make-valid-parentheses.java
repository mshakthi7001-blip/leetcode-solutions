class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack=new ArrayDeque<>();
        boolean[] arr=new boolean[s.length()];
        Arrays.fill(arr,false);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }
            else if(ch==')'){
                if(!stack.isEmpty())
                stack.pop();
                else{
                    arr[i]=true;
                }
            }
        }
        while (!stack.isEmpty()) {
            arr[stack.pop()] = true;
        }
        StringBuilder res=new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(arr[i]==false){
            res.append(s.charAt(i));
        }
      }
    return res.toString();
    }
}