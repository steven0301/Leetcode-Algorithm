class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<text.length() ;i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
        }
        
        if(!map.containsKey('a') || !map.containsKey('b') || !map.containsKey('n') ||
          !map.containsKey('l') || !map.containsKey('o')) return 0;
        
        int a = map.get('a');
        int b = map.get('b');
        int n = map.get('n');
        int min1 = Math.min(Math.min(a, b), n);
        
        int l = map.get('l');
        int o = map.get('o');
        int min2 = Math.min(l, o);
        
        // System.out.println(String.format("min1 : %d, min2 : %d", min1, min2));
        
        int answer = 0;        
        while(true){
            if(min1*2 <= min2){
                answer = min1;
                break;
            }else {
                min1--;
            }
        }
               
        return answer;
    }
}