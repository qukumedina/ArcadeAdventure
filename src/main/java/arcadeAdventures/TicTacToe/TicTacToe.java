package arcadeAdventures.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = null;
    }

    public void start() {
        currentPlayer = Math.random() < 0.5 ? player1 : player2;
        char winner = '\0';
        boolean isBoardFull = false;

        Scanner scanner = new Scanner(System.in);

        while (winner == '\0' && !isBoardFull) {
            board.print();
            System.out.println("Current Player: " + currentPlayer.getMarker());

            if (hasWinner()) {
                winner = board.checkWinner();
                break;  // Exit the loop if there's a winner
            }

            System.out.print("Please choose a row between 0 - 2: ");
            int row = scanner.nextInt();
            System.out.print("Please choose a column between 0 - 2: ");
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board.place(row, col, currentPlayer.getMarker());
                winner = board.checkWinner();
                isBoardFull = board.isFull();

                if (winner == '\0' && !isBoardFull) {
                    switchCurrentPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board.isCellEmpty(row, col);
    }

    private void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean hasWinner(){

        return false;
    }
}

