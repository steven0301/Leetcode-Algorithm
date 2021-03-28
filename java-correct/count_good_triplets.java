class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt = 0;
        for(int i=0; i<arr.length-2 ;i++){
            for(int j=i+1; j<arr.length-1 ;j++){
                for(int k=j+1; k<arr.length; k++){                
                   if(diff(arr[i], arr[j])<=a && diff(arr[j], arr[k])<=b && diff(arr[i], arr[k])<=c) cnt++;
                }
            }
        }
        return cnt;
    }
    
    public int diff(int a, int b){
        return Math.abs(a - b);
    }
}