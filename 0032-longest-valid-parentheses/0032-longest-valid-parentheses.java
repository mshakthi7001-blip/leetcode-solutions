class Solution {
    public int longestValidParentheses(String s) {
    Deque<Integer> st=new ArrayDeque<>();
    int max=0;
    int len=0;
    st.push(-1);
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            st.push(i);
        }
        else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                len=i-st.peek();
            }
              max=Math.max(max,len);
        }

       
    }
    return max;
    }
}