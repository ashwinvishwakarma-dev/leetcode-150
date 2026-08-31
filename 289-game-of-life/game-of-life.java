class Solution {

    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] next = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int liveNeighbors = countNeighbors(board, i, j);

                if (board[i][j] == 1) {

                    // Alive cell survives with 2 or 3 neighbors
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        next[i][j] = 1;
                    }

                } else {

                    // Dead cell becomes alive with exactly 3 neighbors
                    if (liveNeighbors == 3) {
                        next[i][j] = 1;
                    }
                }
            }
        }

        // Copy result back
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = next[i][j];
            }
        }
    }

    private int countNeighbors(int[][] board, int row, int col) {

        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {

            for (int j = col - 1; j <= col + 1; j++) {

                // Don't count current cell
                if (i == row && j == col) {
                    continue;
                }

                // Check boundaries
                if (i >= 0 && i < board.length &&
                    j >= 0 && j < board[0].length) {

                    count += board[i][j];
                }
            }
        }

        return count;
    }
}