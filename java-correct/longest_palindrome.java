import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length ;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+ 1);
        }
        
        int answer = 0;
        int cnt = 0;
        for(char key : map.keySet()){
            int temp = map.get(key);
            answer += temp;
            if(temp%2 != 0) cnt++;
        }
        
        // 홀수의 개수가 2개 이상이면 개수만큼 1을 제하고( -cnt ) 하나의 홀수는 온전히 더해준다 ( +1 )
        if(cnt >= 2) answer = answer - cnt + 1;
        
        return answer;
    }
}