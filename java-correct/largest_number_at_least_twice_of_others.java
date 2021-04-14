import java.util.*;

class Solution {
    public int dominantIndex(int[] nums) {
        int answer=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length ;i++){
            list.add(nums[i]);
        }
        int max = Collections.max(list);        
        
        for(int i=0; i<nums.length ;i++){
            if(nums[i] == max) answer = i;
            else if(max < nums[i]*2) return -1;
        }
        return answer;
    }
}