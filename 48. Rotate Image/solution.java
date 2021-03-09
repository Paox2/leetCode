class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        if (length == 1)
            return;
        
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < length; j++) {
                int temp = 0;
                temp = matrix[j][i];
                matrix[j][i] = matrix[j][length-1-i];
                matrix[j][length-1-i] = temp;
            }
        }
    }
}