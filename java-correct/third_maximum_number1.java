import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return nums[1];
        int count = 1;
        int idx = 0;
        
        //[1,2,2,3]
        for(int i = nums.length-2; i>=0; i--) {
            if (nums[i] < nums[i+1]) {
                count++;
                if(count == 3) {
                   idx = i;
                    break; 
                }
            }
        }
        
        return count == 3 ? nums[idx] : nums[nums.length-1];
    }
}