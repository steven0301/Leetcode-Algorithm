import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List> map = new HashMap<>();
        
        for(int i=0; i<strs.length ;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            // char[] -> String
            String str = new String(arr);

            // ArrayList<String>() 또는 ArrayList() 임에 주의
            if(!map.containsKey(str)) map.put(str, new ArrayList());
            map.get(str).add(strs[i]);
        }
        
        // map.values() : <Strng, List> 에서 List를 가져온다.
        return new ArrayList(map.values());
    }
}