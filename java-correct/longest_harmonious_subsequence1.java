import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        for (int key : map.keySet()) {
            // 중요 : key+1 값이 존재하는지 확인
            if (map.containsKey(key + 1)) {
                // Math를 사용한 max 추출
                max = Math.max(max, map.get(key + 1) + map.get(key));
            }
        }
        return max;
    }
}