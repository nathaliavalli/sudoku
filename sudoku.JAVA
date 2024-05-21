import static sun.security.util.Debug.args;

public class sudoku {
    private static final int SIZE = 9;

    public sudoku(){

    }
    public static boolean isSafe (int [][] game, int row, int col, int num) {

        //checking if number is in the row we are looking
        for (int i = 0; i <= SIZE - 1; i++) {
            if (game[row][i] == num) {
                return false;
            }
        }
        //checking if number is in the column we are looking
        for (int i = 0; i <= SIZE - 1; i++) {
            if (game[i][col] == num) {
                return false;
            }
        }
        int boxRow = row - row % 3;//getting the top row of the local 3x3
        int boxCol = col - col % 3;//getting the left most colum of the local 3x3

        //checking if the number is in the local 3x3
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (game[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveGame(int game [][], int row, int col, int num) {
        if (game[row][col] != 0) {
            return solveGame(game[][],row, col++);
        }

        if (col == SIZE) {
            row++;
            col = 0;
        }

        for ( row; row < SIZE; row++) {
            for (col; col < SIZE; col++) {
                if (game[row][col] == 0) {
                    for (int i = num; num <= SIZE; num++) {
                        if (solveGame( int game[][], int row, int col, int num)){
                            return true;

                        else
                            game[row][col] = 0;
                        }
                    }
                }
            }
        }
        private static void printBoard ( int[][] sudokuGame){
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(" " + game[i][j]
                            + " ");
                    System.out.println();
                }
            }
        }
        public static void main ;(String[]args){
            sudokuGame = new int[][]{
                    {9, 0, 3, 0, 8, 0, 5, 0, 0},
                    {0, 0, 0, 0, 0, 0, 3, 0, 0},
                    {7, 0, 0, 0, 0, 5, 1, 0, 0},
                    {2, 3, 0, 0, 0, 4, 0, 0, 7},
                    {0, 6, 0, 0, 2, 0, 0, 1, 0},
                    {0, 4, 0, 0, 0, 7, 0, 0, 0},
                    {1, 0, 5, 0, 0, 0, 9, 0, 0},
                    {0, 0, 8, 0, 0, 2, 0, 0, 0},
                    {0, 0, 0, 1, 4, 3, 0, 0, 0}};
        }
        solveGame(sudokuGame, 0, 0, 3);
        printBoard(sudokuGame);
    }
}
