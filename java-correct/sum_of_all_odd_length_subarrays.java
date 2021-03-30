class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int len=1; len<=arr.length ;len+=2){
            for(int j=0; j<arr.length; j++){
                int temp = 0;
                for(int k=j; k<j+len; k++){
                    if(k >= arr.length) {
                        temp = 0;
                        break;
                    }
                    temp += arr[k];
                }
                sum += temp;
            }
        }
        return sum;
    }
}