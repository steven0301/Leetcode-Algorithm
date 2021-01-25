import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length == 0) return list;
        
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length-2 ;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if(sum > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        
        Iterator<List<Integer>> it = set.iterator();
        while(it.hasNext()){
            list.add(it.next());
        }
        // for(List<Integer> l : set){
        //     list.add(l);
        // }
        
        return list;
    }
}