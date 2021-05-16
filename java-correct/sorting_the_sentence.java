import java.util.HashMap;
import java.util.Map;

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Map<Integer, String> map = new HashMap<>();
        for(String word : words){
            int num = Integer.parseInt(String.valueOf(word.charAt(word.length()-1)));
            map.put(num, word.substring(0, word.length()-1));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=words.length ;i++){
            sb.append(map.get(i));
            if(i != words.length) sb.append(" ");
        }
        return sb.toString();
    }
}