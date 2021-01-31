import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length ;i++){
            char ch = arr[i];
            if(!stack.isEmpty()){
                switch(stack.peek()){
                    case '(' : 
                        if(ch == ')') stack.pop();
                        else stack.push(ch);
                        break;
                    case '{' :
                        if(ch == '}') stack.pop();
                        else stack.push(ch);
                        break;
                    case '[' :
                        if(ch == ']') stack.pop();
                        else stack.push(ch);
                        break;
                }
            }else {
                stack.push(ch);
            }
        }
        
        return stack.isEmpty()? true : false;
    }
}