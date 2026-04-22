class Solution {
    public boolean dfs(char[][] board, int wcindex, String str, int i, int j, int[][] vis) {
        // Base conditions to stop DFS
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (vis[i][j] == 1) return false;  // Already visited
        if (board[i][j] != str.charAt(wcindex)) return false;  // Character mismatch
        
        // If we've matched all characters in the word, return true
        if (wcindex == str.length() - 1) return true;
        
        // Mark the current cell as visited
        vis[i][j] = 1;

        // Explore all four directions (up, down, left, right)
        boolean match = false;
        if (i - 1 >= 0 && !match) match = dfs(board, wcindex + 1, str, i - 1, j, vis);
        if (i + 1 < board.length && !match) match = dfs(board, wcindex + 1, str, i + 1, j, vis);
        if (j - 1 >= 0 && !match) match = dfs(board, wcindex + 1, str, i, j - 1, vis);
        if (j + 1 < board[0].length && !match) match = dfs(board, wcindex + 1, str, i, j + 1, vis);

        // Unmark the current cell (backtrack)
        vis[i][j] = 0;
        
        return match;
    }

    public boolean exist(char[][] board, String word) {
        boolean result = false;
        int[][] vis = new int[board.length][board[0].length];
        
        // Try to start the DFS from every cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = result || dfs(board, 0, word, i, j, vis);
                }
            }
        }
        
        return result;
    }
}
