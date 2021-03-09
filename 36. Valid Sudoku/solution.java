class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cubes = new HashSet<Character>();
            
            for (int j = 0; j < 9; j++) {
                if ((board[i][j] != '.' && !rows.add(board[i][j])) || (board[j][i] != '.' && !columns.add(board[j][i]))) {
                    return false;
                }
                
                int cubeStartRow = (i / 3) * 3;
                int cubeStartColumn = (i % 3) * 3;
                if (board[cubeStartRow + j / 3][cubeStartColumn + j % 3] != '.' && !cubes.add(board[cubeStartRow + j / 3][cubeStartColumn + j % 3]))
                    return false;
            }
        }
        
        return true;
    }
}