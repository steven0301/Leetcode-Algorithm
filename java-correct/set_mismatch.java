import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length ;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) == 2) answer[0] = nums[i];
        }
        
        for(int i=1; i<=nums.length ;i++){
            if(!map.containsKey(i)){
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
}