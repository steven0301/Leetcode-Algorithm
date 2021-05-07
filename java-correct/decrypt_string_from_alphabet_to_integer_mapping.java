import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String freqAlphabets(String s) {
        // (10#, j)...(26#, z), (1, a)...(9, i)
        Map<String, Character> map = new LinkedHashMap<>();
        for(int i=10; i<=26 ;i++){
            map.put(i+"#", (char)(96+i));
        }
        for(int i=1; i<=9 ;i++){
            map.put(i+"", (char)(96+i));
        }
        
        // replace string with key & value
        for(String key : map.keySet()){            
            if(s.contains(key))  s = s.replaceAll(key, map.get(key)+"");            
        }
        
        return s;
    }
}