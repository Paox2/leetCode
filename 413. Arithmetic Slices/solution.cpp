class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& A) {
        int size = A.size();
        if (size <= 2)
            return 0;
        
        int slices = 0;
        int continues = 0;
        
        for (int i = 1; i < size - 1; i++) {
            if (A[i] - A[i-1] == A[i+1] - A[i]) {
                continues = continues + 1;
                slices += continues;
            } else {
                continues = 0;
            }
        }
        
        return slices;
    }
};