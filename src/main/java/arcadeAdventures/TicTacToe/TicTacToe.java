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
        //TODO
    }

    private void switchCurrentPlayer() {
        //TODO
    }

    private boolean hasWinner(){

        return false;
    }
}

