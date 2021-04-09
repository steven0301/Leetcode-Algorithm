import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] == nums[i])
                answerList.add(nums[i]);
        }
        return answerList;
    }
}