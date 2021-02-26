import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkRecord(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        char prev = 'B';
        int cnt = 1;
        for(int i=0; i<s.length() ;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            // 중요 : 다른 방법으로는 "LLL"이 문장 내에 포함되었는지 확인하는 수도 있다.
            if(ch == 'L'){
                if(prev == 'L') cnt++;
            }else {
                cnt = 1;
            }
            if(cnt == 3) return false;
            prev = ch;
        }
        
        boolean answer = true;
        
        if(map.containsKey('A') && map.get('A') > 1) return false;
        
        return answer;
    }
}