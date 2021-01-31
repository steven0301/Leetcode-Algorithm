import java.util.HashMap;
import java.util.Map;

class Solution {
    public int repeatedNTimes(int[] A) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int e : A){
            map.put(e, map.getOrDefault(e, 0)+ 1);
        }
        
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value >= A.length/2){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}