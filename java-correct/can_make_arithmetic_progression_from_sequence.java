import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = -1;
        for(int i=0; i<arr.length-1 ;i++){
            int temp = arr[i+1]-arr[i];
            if(diff == -1) diff = temp;
            else if(diff != temp) return false;            
        }
        return true;
    }
}