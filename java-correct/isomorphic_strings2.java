import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        int idx1 = 0;
        int idx2 = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int i=0; i<s.length() ;i++){
            
            char ch1 = s.charAt(i);
            if(!map1.containsKey(ch1)) map1.put(ch1, idx1++);
            list1.add(map1.get(ch1));
            
            char ch2 = t.charAt(i);
            if(!map2.containsKey(ch2)) map2.put(ch2, idx2++);
            list2.add(map2.get(ch2));
        }
        
        return list1.equals(list2);
    }
}