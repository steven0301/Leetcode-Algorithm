import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int thirdMax(int[] nums) {
        
        if(nums.length == 0) return 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length ;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        Set<Integer> set = new HashSet(list);
        List<Integer> list2 = new ArrayList(set);
        Collections.sort(list2, Collections.reverseOrder());
        
        int answer = list2.get(0);
        int cnt = 0;
        for(int e : list2){
            cnt++;
            if(cnt == 3){
                answer = e;
                break;
            }
        }
        
        return answer;
    }
}