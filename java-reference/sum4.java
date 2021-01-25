import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    
    List<List<Integer>> list = new ArrayList<>();
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        permutation(nums, 0, nums.length, 4, target);
        return list;
    }
    
    public void permutation(int[] nums, int depth, int n, int r, int target){
        if(depth == r){
            checkTrue(nums, target);
            return;
        }
        for(int i=depth; i<n ;i++){
            swap(nums, depth, i);
            permutation(nums, depth+1, n, r, target);
            swap(nums, depth, i);
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void checkTrue(int[] nums, int target){
        List<Integer> tempList = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<4 ;i++){
            sum += nums[i];
        }
        for(int i=0; i<4 ;i++){
            tempList.add(nums[i]);
        }
        Collections.sort(tempList);
        if(sum == target && !list.contains(tempList)) list.add(tempList);
    }
}