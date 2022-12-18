package Move;

public class CorrectMove {
    public boolean moveCheck(int[][] board,
                             int inputRow, int inputCol){
        return board[inputRow][inputCol] == 0;
    }

    public boolean botMoveCheck(int[][] board, int inputRow, int inputCol){
        boolean validMove = false;

        if((inputRow != -1) && (inputCol != -1) && (inputCol != 0)){
            if (board[inputRow][inputCol]==0) validMove = true;
        }

        return validMove;
    }
}
