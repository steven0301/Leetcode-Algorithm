import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> answerList = new ArrayList<>();
        int temp = 0;
        for(int i=0; i<A.length ;i++){
            temp = (temp * 2 + A[i])%5;
            boolean check = temp == 0 ? true : false;
            answerList.add(check);
        }
        return answerList;
    }
}