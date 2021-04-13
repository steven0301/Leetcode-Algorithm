import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int first = nums[0] * nums[1] * nums[len-1];
        int second = nums[len-3] * nums[len-2] * nums[len-1];
        return Math.max(first, second);
    }
}