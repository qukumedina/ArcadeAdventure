package arcadeAdventures.TicTacToe;

public class Board {
    private char[][] cells = new char[3][3];

    public Board() {
        //TODO
    }

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] != 'X' && cells[x][y] != 'O';
    }

    public void place(int x, int y, char marker) {
        cells[x][y] = marker;
    }

    public boolean isFull() {
        for (char[] row : cells) {
            for (char cell : row) {
                if (cell != 'X' && cell != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        //TODO
    }


    public void print() {
        //TODO
    }

    public char checkWinner() {
        //TODO
        return '0';
    }
}
