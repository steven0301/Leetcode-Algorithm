class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length <= 2) return false;
        int diff = arr[1] - arr[0];
        if(diff == 0 || diff < 0) return false;
        int cnt = 0;
        for(int i=1; i<arr.length-1 ;i++){
            int temp = arr[i+1] - arr[i];
            if(temp == 0) return false;
            if(!checkIfSame(diff,temp)){
                cnt++;
            }
            diff = temp;
        }
        return cnt == 1 ? true : false;
    }
    // 부호가 같은지 확인
    public boolean checkIfSame(int diff, int temp){
        int mul = diff * temp;
        return mul > 0 ? true : false;
    }
}