import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String reverseOnlyLetters(String S) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);

            // 중요 : Charactaer의 isLetter 혹은 isDigit 을 적절히 사용하도록 한다.
            if(Character.isLetter(ch)) list.add(S.charAt(i));
        }
        
        Collections.reverse(list);
        
        List<Character> answerList = new ArrayList<>();
        for(int i=0, j=0; i<S.length() && j<S.length() ;i++){
            char ch = S.charAt(i);
            if(!Character.isLetter(ch)) answerList.add(ch);
            else answerList.add(list.get(j++));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<answerList.size() ;i++){
            sb.append(answerList.get(i));
        }
        
        return sb.toString();
    }
}