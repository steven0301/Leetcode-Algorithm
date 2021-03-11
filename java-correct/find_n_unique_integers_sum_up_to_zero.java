class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int j = 0;
        int start = (-1)*n/2;
        int end = n/2;
        
        for(int i=start; i<= end; i++){
            if(n%2 == 0 && i == 0) continue;
            arr[j++] = i;
        }
        
        return arr;
    }
}