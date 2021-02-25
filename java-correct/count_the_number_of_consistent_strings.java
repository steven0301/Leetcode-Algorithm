import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        
        int cnt = 0;
        for(String word : words){
            boolean check = true;
            for(int i=0; i<word.length(); i++){
                if(!set.contains(word.charAt(i))){
                    check = false;
                    break;
                }
            }
            if(check) cnt++;
        }
        
        return cnt;
    }
}