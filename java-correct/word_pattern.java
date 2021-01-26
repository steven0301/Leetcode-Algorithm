import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str = s.split(" ");
        
        if(pattern.length() != str.length) return false;
        
        Map<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length() ;i++){
            char key = pattern.charAt(i);
            if(!map.containsKey(key)){
                // abba, dog dog dog dog -> false가 정답
                if(map.containsValue(str[i])){
                    return false;
                }
                map.put(key, str[i]);
            // 이미 등록된 값과 비교했을 때 다른 경우
            }else {
                if(!map.get(key).equals(str[i])) return false;
            }
        }
        
        return true;        
    }
}