import java.util.Stack;

class Solution {
    public String reverseVowels(String s) {
        
        char[] arr = new char[s.length()];
        Stack<Character> stack = new Stack<>();        
        for(int i=0; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
              ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                stack.push(ch);
            }else {
                arr[i] = ch;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length ;i++){
            char ch = arr[i];
            // 중요 : char[]의 element는 아무것도 입력하지 않으면 '\0'이다.
            if(ch == '\0'){
                char temp = stack.pop();
                arr[i] = temp;
            }
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}