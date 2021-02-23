class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        if (target > matrix[m][n] || target < matrix[0][0]) {
            return false;
        }
        
        int i = 0;
        while (m > -1 && i < (n+1)) {
            if (matrix[m][i] == target) {
                return true;
            } else if (matrix[m][i] > target) {
                m--;
            } else {
                i++;
            }
        }
        
        return false;
    }
}