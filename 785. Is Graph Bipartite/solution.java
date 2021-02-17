class Solution {
    private boolean[] marked;
    private boolean[] color;
    private boolean isTwoSameColorAdjacent;
    
    public boolean isBipartite(int[][] graph) {
        marked = new boolean[graph.length];
        color = new boolean[graph.length];
        
        for (int i = 0; i < graph.length; i++) {
            if (!marked[i]) {
                helper(graph, i);
            }
            
            if (isTwoSameColorAdjacent) {
                return false;
            }
        }
        
        return true;
    }
    
    private void helper(int[][] graph, int i) {
        marked[i] = true;
        for (int node : graph[i]) {
            if (!marked[node]){
                color[node] = !color[i];
                helper(graph, node);
            } else if (color[node] == color[i]) {
                isTwoSameColorAdjacent = true;
            }
        }
    }
}