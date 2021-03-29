class Solution {
    public int uniquePaths(int m, int n) {
        // 중복 순열의 경우 n!/(a * b)
        // ex) aabb와 같은 경우 a가 2개이고 b가 2개이므로 4!을 2!와 2!로 나누어야 함. 
        return (int)Math.round((factorial(m+n-2)/(factorial(n-1))/factorial(m-1)));
    }
    
    public double factorial(double number){
        if(number <= 1) return 1;
        else {
            return number * factorial(number-1);
        }
    }
}