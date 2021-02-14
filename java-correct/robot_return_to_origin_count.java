class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for (char move : moves.toCharArray()){
            if (move=='U') x++;
            if (move=='D') x--;
            if (move=='R') y++;
            if (move=='L') y--;
        }
        return x==0 && y==0;
    }
}