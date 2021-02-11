import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r=mat.length;
        int c=mat[0].length;
        ArrayList<Integer> l=new ArrayList<Integer>();
        int a[]=new int[r];
        int ans[]=new int[k];
        int count=0;
        for(int i=0;i<r;i++){
            count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    count+=1;
                }
            }
            l.add(count);
            a[i]=count;
        }
        Arrays.sort(a);
        for(int i=0;i<k;i++){
            int index=l.indexOf(a[i]);
            ans[i]=index;
            l.set(index,Integer.MAX_VALUE);
        }
        return ans;
    }
}