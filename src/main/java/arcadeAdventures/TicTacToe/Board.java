package arcadeAdventures.TicTacToe;

public class Board {
    private char[][] cells;

    public Board() {
        cells = new char[3][3];
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
        System.out.println("\n ___________");
        for (int i = 0; i < 3; i++) {
            System.out.println("|   |   |   |");
            System.out.printf("| %c | %c | %c |\n", cells[i][0], cells[i][1], cells[i][2]);
            System.out.println("|___|___|___|");
        }
    }

    public char checkWinner() {
        // Check horizontal, vertical, and diagonal lines for a win
        for (int i = 0; i < 3; i++) {
            if (cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2] && cells[i][0] != ' ')
                return cells[i][0];
            if (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i] && cells[0][i] != ' ')
                return cells[0][i];
        }
        if (cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2] && cells[0][0] != ' ')
            return cells[0][0];
        if (cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0] && cells[0][2] != ' ')
            return cells[0][2];
        return '\0'; // no winner yet
    }
}
