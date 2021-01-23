import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        
        // 시간 초과
        // String -> int (Binary)
        // int sum = Integer.parseInt(a, 2) + Integer.parseInt(b,2);    
        
        // int(Binary) -> String(Binary)
        // return Integer.toBinaryString(sum);
        
        return (new BigInteger(a,2)).add(new BigInteger(b,2)).toString(2);
        
    }
}