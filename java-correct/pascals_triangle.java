import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answerList = new ArrayList<>();
        
        if(numRows <= 0) return answerList;        
        
        List<Integer> prevList = new ArrayList<>();
        prevList.add(1);
        answerList.add(prevList);
        
        // [1]
        if(numRows == 1) return answerList;
        
        // [1], [1,1]
        if(numRows == 2) {
            prevList = new ArrayList<>();
            prevList.add(1);
            prevList.add(1);
            answerList.add(prevList);
            return answerList;
        }
        
        for(int i=0; i<numRows-1; i++){
            List<Integer> tmpList = new ArrayList<>();
            tmpList.add(1);
            for(int j=0; j<prevList.size()-1 ;j++){
                int sum = prevList.get(j) + prevList.get(j+1);
                tmpList.add(sum);
            }
            tmpList.add(1);
            prevList = tmpList;
            answerList.add(tmpList);
        }
        
        return answerList;
    }
}