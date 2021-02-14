class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<moves.length() ;i++){
            char ch = moves.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+ 1);
        }
        
        int answer = 1;
        
        
        // 주의 : Integer은 객체이므로 == 연산이 아닌 equlas로 비교해야 한다.
        if(map.get('U') != null && !map.get('U').equals(map.get('D'))) answer *= 0;
        if(map.get('D') != null && !map.get('D').equals(map.get('U'))) answer *= 0;
        if(map.get('L') != null && !map.get('L').equals(map.get('R'))) answer *= 0;
        if(map.get('R') != null && !map.get('R').equals(map.get('L'))) answer *= 0;

        return answer == 1 ? true : false;
    }
}