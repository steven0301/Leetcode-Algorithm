import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answerList = new ArrayList<>();
        if(nums.length == 0) return answerList;
        Arrays.sort(nums);
        int prev = nums[0];
        int cnt = 1;
        for(int i=1; i<nums.length ;i++){
            if(prev == nums[i]){
                cnt++;
            }else {
                if(cnt >= 2) answerList.add(prev);
                prev = nums[i];
                cnt = 1;
            }
        }
        // [1, 1]일 경우
        if(cnt >= 2) answerList.add(prev);
        return answerList;
    }
}