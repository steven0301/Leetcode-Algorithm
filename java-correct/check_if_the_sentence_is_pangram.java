import java.util.Arrays;

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        Arrays.fill(arr, false);
        for(int i=0;i<sentence.length();i++){
            arr[(int) sentence.charAt(i)-97] = true;
        }
        for(boolean e : arr)
            if(!e) return false;
        return true;
    }
}