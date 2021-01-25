import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k){
                answer++;
                left++;
                right--;
            }else if(sum > k){
                right--;
            }else {
                left++;
            }
        }
        return answer;
    }
}