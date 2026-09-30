class Solution {
    public boolean isValid(String s) {
        Deque<Character> a = new ArrayDeque<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='{'||ch=='['||ch=='('){
                a.push(ch);
            }
            else{
                if(a.isEmpty())
                return false;
                char top=a.pop();
                    if(ch==')'&& top!='(')
                    return false;
                    else if(ch==']'&& top!='[')
                    return false;
                     if(ch=='}'&& top!='{')
                    return false;
            }
           
        }
         return a.isEmpty();
    }
}