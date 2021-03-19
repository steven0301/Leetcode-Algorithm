class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        
        // 부분 합이 최대의 합이 되는 그리디 방식
        for(int i=1; i<nums.length ;i++){
            current = Math.max(current + nums[i], nums[i]);
            max = Math.max(max, current);
        }
        
        return max;
    }
}