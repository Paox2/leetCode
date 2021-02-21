class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int length = A.length;
        if (length <=2)
            return 0;
        
        int slices = 0;
        int continues = 0;
        for (int i = 1; i < (length - 1); i++) {
            continues = (A[i] - A[i-1] == A[i+1] - A[i]) ? (continues + 1) : 0;
            slices += continues;
        }
        
        return slices;
    }
}