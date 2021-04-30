import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int e : arr){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        Set<Integer> set = new HashSet(map.values());
        return map.size() == set.size() ? true : false;
    }
}