import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr1.length ;i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        List<Integer> listBack = new ArrayList<>();
        for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i])){
                for(int j=0; j<map.get(arr2[i]) ;j++){
                    list.add(arr2[i]);
                }
                map.remove(arr2[i]);
            }
        }
        
        for(int key : map.keySet()){
            for(int i=0; i<map.get(key) ;i++){
                listBack.add(key);
            }
        }
                
        Collections.sort(listBack);
        list.addAll(listBack);
        int[] answerArr = new int[list.size()];
        for(int i=0; i<list.size() ;i++){
            answerArr[i] = list.get(i);
        }
        return answerArr;
    }
}