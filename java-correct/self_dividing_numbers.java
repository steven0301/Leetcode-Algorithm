import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right ;i++){
            if(check(i)) list.add(i);
        }
        return list;
    }
    
    public boolean check(int number){
        int num = number;
        while(num != 0){
            int mod = num%10;
            if(mod == 0) return false;
            else if(number%mod != 0) return false;
            num /= 10;
        }
        return true;
    }
}