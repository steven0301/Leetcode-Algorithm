import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String longestWord(String[] words) {
        String answer = "";
        
        Set<String> set = new HashSet<>();
        for(String word : words) set.add(word);
        // 정렬기준 : 1. 길이가 클수록 2. 알파벳순서
        Arrays.sort(words, (a,b) -> a.length()==b.length() ? a.compareTo(b) : b.length() - a.length());
        for(String word : words){
            boolean check = true;
            for(int i=1; i<word.length() ;i++){
                if(!set.contains(word.substring(0, i))){
                    check = false;
                    break;
                }
            }
            if(check) return word;
        }
        
        return answer;
    }
}