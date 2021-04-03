import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for(int i=0; i<A.length ;i++){
            if(A[i] % 2 == 0) evenList.add(A[i]);
            else oddList.add(A[i]);
        }
        
        // Collections.sort(oddList);
        // Collections.sort(evenList);
        
        List<Integer> answerList = new ArrayList<>();
        answerList.addAll(evenList);
        answerList.addAll(oddList);
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size() ;i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}