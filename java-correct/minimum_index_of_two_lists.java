import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
          
        Map<String, Integer> map2 = new HashMap<>();
                
        for(int i=0; i<list2.length ;i++){
            map2.put(list2[i], i);
        }
        
        Map<String, Integer> map3 = new HashMap<>();
        for(int i=0; i<list1.length ;i++){
            if(map2.containsKey(list1[i])){
                map3.put(list1[i], i+map2.get(list1[i]));
            }
        }
        
        List<String> answerList = new ArrayList<>();    
        List<Integer> list = new ArrayList(map3.values());
        int min = Collections.min(list);
        for(String key : map3.keySet()){
            if(map3.get(key) == min) answerList.add(key);
        }
        
        return answerList.toArray(new String[answerList.size()]);
    }
}