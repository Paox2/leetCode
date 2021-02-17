class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int sizeX = grid.length - 1;
        int sizeY = grid[0].length - 1;
        if(grid[0][0] == 1 || grid[sizeX][sizeY] == 1)
            return -1;
        
        int[] dx = {1, 0, -1, 0, -1, 1, -1, 1};
        int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
        Queue<int[]> bfsQueue = new LinkedList<>();
        bfsQueue.add(new int[]{0,0});
        grid[0][0] = 1;
        int nextX;
        int nextY;
        
        while (bfsQueue.size() > 0) {
            int[] current = bfsQueue.remove();
            int x = current[0];
            int y = current[1];
            
            if (x == sizeX && y == sizeY)
                return grid[x][y];
            
            for (int i = 0; i < 8; i++) {
                nextX = x + dx[i];
                nextY = y + dy[i];
                
                if(nextX >= 0 && nextX <= sizeX && nextY >= 0 && nextY <= sizeY && grid[nextX][nextY] == 0) {
                    bfsQueue.add(new int[]{nextX, nextY});
                    grid[nextX][nextY] = grid[x][y] + 1;
                }
            }
        };
        return -1;
    }
}