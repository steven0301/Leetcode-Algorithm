import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> answerList = new ArrayList<>();
        if(K == 0){
            for(int i=0; i<A.length ;i++){
                answerList.add(A[i]);
            }
            return answerList;
        }
        
        StringBuilder sb = new StringBuilder();
        while(K != 0){
            sb.append(K%10);
            K /= 10;
        }
        String str = sb.reverse().toString();
        BigDecimal k = new BigDecimal(str);

        sb = new StringBuilder();
        for(int i=0;i<A.length;i++){
            sb.append(A[i]);
        }
        str = sb.toString();
        
        BigDecimal a = new BigDecimal(str);
        BigDecimal sum = a.add(k);
        str = sum.toString();
        
        for(int i=0; i<str.length() ;i++){
            answerList.add(str.charAt(i)-'0');
        }
        
        return answerList;
    }
}