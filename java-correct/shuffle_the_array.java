import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length/2 ;i++){
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}