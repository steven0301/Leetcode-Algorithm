class Solution {
    public String destCity(List<List<String>> paths) {
        
        Map<String, String> map = new HashMap<>();
        for(List<String> list : paths){
            for(int i=0; i<2 ;i++){
                map.put(list.get(0), list.get(1));
            }
        }
        
        String answer = "";
        for(String key : map.keySet()){
            if(!map.containsKey(map.get(key))){
                answer = map.get(key);
            }
        }
        
        return answer;
    }
}