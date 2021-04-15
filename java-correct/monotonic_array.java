class Solution {
    public boolean isMonotonic(int[] A) {
        
        if(A.length == 1) return true;
        
        int checkPoint = 0;
        if(A[0] - A[1] > 0) checkPoint = 1;
        else if(A[0] -A[1] < 0) checkPoint = -1;
        
        for(int i=1; i<A.length-1; i++){
            int tempCheckPoint = 0;
            if(A[i] - A[i+1] > 0) tempCheckPoint = 1;
            else if(A[i] - A[i+1] < 0) tempCheckPoint = -1;
            
            if(tempCheckPoint == 0) continue;
            if(checkPoint == 0) checkPoint = tempCheckPoint;
            else if(checkPoint != tempCheckPoint) return false;
        }
        return true;
    }
}