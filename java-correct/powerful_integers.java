import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<100 ;i++){
            for(int j=0; j<100 ;j++){
                int temp = calc(x, i, y, j, bound);
                if(temp == -1) break;
                else set.add(temp);
            }
        }
        
        // set -> list
        List<Integer> list  = new ArrayList(set);
        return list;
    }
    
    public int calc(int x, int i, int y, int j, int bound){
        double answer = Math.pow(x,i)+Math.pow(y,j);
        return  answer > bound ? -1 : (int) answer;
    }
}