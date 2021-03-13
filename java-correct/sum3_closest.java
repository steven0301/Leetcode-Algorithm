import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int len = nums.length;
        
        // Two pointer를 사용하기 위해 정렬
        Arrays.sort(nums);
        for(int i=0; i<len && diff != 0; i++){
            int start = i+1;
            int end = len-1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(target-sum) < Math.abs(diff))
                    diff = target-sum;
                if(sum < target) start++;
                else end--;
            }
        }
        
        // target - (target - sum) = sum
        return target-diff;
    }
}