class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prev = 0;
        for(int i=0; i<gain.length ;i++){
            int temp = gain[i] + prev;
            if(max < temp) max = temp;
            prev = temp;
        }
        
        return max;
    }
}