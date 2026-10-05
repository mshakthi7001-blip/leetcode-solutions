class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(0);
            } 
            else {
                int x = stack.pop();
                int val = Math.max(2 * x, 1);

                stack.push(stack.pop() + val);
            }
        }

        return stack.peek();
    }
}