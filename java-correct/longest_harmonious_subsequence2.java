import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<nums.length ;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+ 1);
        }
        
        if(map.size()==1) return 0;
                
        int prevKey = -1;
        int prevSum = -1;
        int max = 0;
        for(int key : map.keySet()){
            if(prevKey+1 == key){
                if(max < prevSum + map.get(key)) {
                    max = prevSum + map.get(key);
                }
            }
            prevKey = key;
            prevSum = map.get(key);
        }
        
        return max;
    }
}