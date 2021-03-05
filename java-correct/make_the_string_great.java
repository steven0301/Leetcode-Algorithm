import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() != ch && Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch))
                stack.pop();
            else
                stack.push(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}