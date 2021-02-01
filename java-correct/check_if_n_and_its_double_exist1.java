import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> check = new HashSet<Integer>();
        for (int a : arr){
            if ((check.contains(a * 2)) || (a % 2 == 0 && check.contains(a/2)) ){
                return true;
            }
            check.add(a);
        }
        return false;
    }
}