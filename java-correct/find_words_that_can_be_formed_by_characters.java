import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countCharacters(String[] words, String chars) {
        int cnt = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : chars.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(String str : words){
            Map<Character, Integer> tempMap = new HashMap<>();
            for(char ch : str.toCharArray()){
                tempMap.put(ch, tempMap.getOrDefault(ch, 0)+1);
            }
            
            boolean flag = true;
            for(char key : tempMap.keySet()){
                if(!map.containsKey(key)) {
                    flag = false;
                    break;
                }
                if(tempMap.get(key) > map.get(key)) {
                    flag = false;
                    break;
                }
            }
            if(flag) cnt += str.length();
        }
        
        return cnt;
    }
}