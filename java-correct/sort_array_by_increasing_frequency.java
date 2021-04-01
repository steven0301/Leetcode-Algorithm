import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        List<Node> list = new ArrayList<>();
        for(int key : map.keySet()){
            list.add(new Node(key, map.get(key)));
        }
        
        Collections.sort(list);
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i=0; i<list.size() ;i++){
            for(int j=0; j<list.get(i).freq; j++){
                answerList.add(list.get(i).num);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answer.length ;i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}

class Node implements Comparable<Node> {
    public int num;
    public int freq;
    
    Node(int num, int freq){
        this.num = num;
        this.freq = freq;
    }
    
    public int compareTo(Node n){
        if(this.freq < n.freq){
            return -1;
        }else if(this.freq == n.freq){
            if(this.num > n.num){
                return -1;
            }else {
                return 1;
            }
        }else {
            return 1;
        }
    }
}