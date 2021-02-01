class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int answer = 0;  
        int i = 0;
        while(i < flowerbed.length){
            // (좌측이 0 또는 좌측 맨 끝), 본 값이 0, (우측이 0 또는 우측 맨 끝) 일 경우
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && 
              (i == flowerbed.length-1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                answer++;
            }
            i++;
        }
        return answer >= n;
    }
}