class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int x = mat.length;
        int y = mat[0].length;
        boolean[] mark = new boolean[x];
        int[] weak = new int[k];
        int index = 0;
        
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (mat[j][i] == 0 && !mark[j]) {
                    weak[index++] = j;
                    mark[j] = true;
                    
                    if (index == k)
                        return weak;
                }
                
            }
        }
        
        int i = 0;
        while(index < k) {
            if (!mark[i]) {
                weak[index++] = i;
            }
            i++;
        }
        
        return weak;
    }
}