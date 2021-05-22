class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = nums[0];
        for(int i=0; i<nums.length-1 ;i++){
            int diff = nums[i+1]-nums[i];
            if(diff > 0) sum += nums[i+1];
            else {
                max = Math.max(max, sum);
                sum = nums[i+1];
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}