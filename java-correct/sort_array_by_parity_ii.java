import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for(int i=0; i<nums.length ;i++){
            if(nums[i] %2 ==0) evenList.add(nums[i]);
            else oddList.add(nums[i]);
        }
        
        int[] answer = new int[nums.length];
        int oddIdx = 0;
        int evenIdx = 0;
        for(int i=0; i<answer.length ;i++){
            if(i%2 == 0) answer[i] = evenList.get(evenIdx++);
            else answer[i] = oddList.get(oddIdx++);
        }
        return answer;
    }
}