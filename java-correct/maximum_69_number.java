class Solution {
    public int maximum69Number (int num) {
        int cnt = 0;
        String number = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        char[] arr = number.toCharArray();
        for(int i=0; i<arr.length ;i++){
            if(cnt == 0 && arr[i] == '6'){
                arr[i] = '9';
                cnt++;
            }
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}