import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<>();
        for(int i=0; i<words.length ;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<words[i].length() ;j++){
                char ch = words[i].charAt(j);
                sb.append(arr[ch - 'a']);
            }
            set.add(sb.toString());
        }
        
        return set.size();
    }
}