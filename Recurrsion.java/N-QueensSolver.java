import java.util.ArrayList;
import java.util.List;

public class NQueensSolver {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(result, board, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, char[][] board, int row) {
        if (row == board.length) {
            result.add(createBoardConfiguration(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(result, board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
            if (col - (row - i) >= 0 && board[i][col - (row - i)] == 'Q') {
                return false;
            }
            if (col + (row - i) < board.length && board[i][col + (row - i)] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> createBoardConfiguration(char[][] board) {
        List<String> config = new ArrayList<>();
        for (char[] row : board) {
            config.add(new String(row));
        }
        return config;
    }

    public static void main(String[] args) {
        NQueensSolver solver = new NQueensSolver();
        int n = 4;  // Change this to the desired board size
        List<List<String>> solutions = solver.solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
// output --->
.Q..
...Q
Q...
..Q.

..Q.
Q...
...Q
.Q..
--------------------------------------------------------------------------------------------------------------
