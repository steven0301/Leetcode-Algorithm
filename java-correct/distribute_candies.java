import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {

        int n = candyType.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<candyType.length; i++){
            set.add(candyType[i]);
        }
               
        return n > set.size() ? set.size() : n;
    }
}
