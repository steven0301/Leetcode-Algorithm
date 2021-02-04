import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answerList = new ArrayList<>();
        if(nums.length == 0 || nums == null) return answerList;
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            while(i < nums.length - 1 && nums[i]+1 == nums[i+1]){
                i++;
            }
            
            // 하나씩 안 커지는 경계에서 판단
            if(num != nums[i]) answerList.add(num+"->"+nums[i]);
            else answerList.add(num+"");
                
        }
        return answerList;
    }
}