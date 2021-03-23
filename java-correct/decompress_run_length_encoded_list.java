import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for(int i=0; i<nums.length ;i++){
            if(i%2 ==0) temp = nums[i];
            else {
                for(int j=0; j<temp ;j++){
                    list.add(nums[i]);
                }
                temp = 0;
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size() ;i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}