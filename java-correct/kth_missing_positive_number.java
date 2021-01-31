import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        for(int e : arr) set.add(e);
        for(int i=1; i<=1000 ;i++){
            if(!set.contains(i)) cnt++;
            if(cnt==k) return i;
        }      
        return 1000+(k-cnt);
    }
}