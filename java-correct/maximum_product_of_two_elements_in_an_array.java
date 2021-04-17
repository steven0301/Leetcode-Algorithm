import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int a = nums[len-1]-1;
        int b = nums[len-2]-1;
        return a*b;
    }
}