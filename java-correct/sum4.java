import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
        public List < List < Integer >> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set < List < Integer >> set = new HashSet < > ();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i] + nums[j];
                    if (sum == target) {
                        // 중복을 방지하기 위해서 Set에 List 저장
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < target) left++;
                    else right--;
                }
            }
        }

        List < List < Integer >> list = new ArrayList < > ();
        for (List < Integer > summation: set)
            list.add(summation);

        return list;
    }
}