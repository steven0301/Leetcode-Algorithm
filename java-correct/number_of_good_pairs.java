import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<nums.length ;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+ 1);
        }
        
        for(int key : map.keySet()){
            answer += calculation(map.get(key));
        }
        
        return answer;
    }
    
    public int calculation(int n){
        return n*(n-1)/2;
    }
}