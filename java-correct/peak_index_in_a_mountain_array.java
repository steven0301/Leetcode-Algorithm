class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx = 0;
        for(int i=0; i<arr.length-1 ;i++){
            if(arr[i+1]-arr[i] < 0){
                idx = i;
                break;
            }
        }
        return idx;
    }
}