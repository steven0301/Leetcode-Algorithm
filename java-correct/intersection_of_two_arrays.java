import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        List<Integer> answerList = new ArrayList<>();
        
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<nums1.length ;i++){
            set1.add(nums1[i]);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums2.length ;i++){
            set2.add(nums2[i]);
        }
        
        Iterator<Integer> iter = set1.iterator();
        while(iter.hasNext()){
            int e = iter.next();
            if(set2.contains(e)) answerList.add(e);
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size() ;i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}