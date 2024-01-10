package arcadeAdventures.TicTacToe;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }
    // Tests for isCellEmpty
    @Test
    public void testIsCellEmptyInitially() {
        Assert.assertTrue("Cell should be empty initially", board.isCellEmpty(0, 0));
    }

    @Test
    public void testIsCellEmptyAfterPlacement() {
        board.place(0, 0, 'X');
        Assert.assertFalse("Cell should not be empty after placement", board.isCellEmpty(0, 0));
    }

    // Tests for place
    @Test
    public void testPlaceMarker() {
        board.place(1, 1, 'O');
        Assert.assertFalse("Cell should be occupied after placing a marker", board.isCellEmpty(1, 1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPlaceMarkerOutOfBounds() {
        board.place(3, 3, 'X');
    }

    // Tests for isFull
    @Test
    public void testBoardNotFullInitially() {
        Assert.assertFalse("Board should not be full initially", board.isFull());
    }

    @Test
    public void testBoardFullAfterPlacements() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }
        Assert.assertTrue("Board should be full after all cells are occupied", board.isFull());
    }

    // Tests for clear
    @Test
    public void testClearEmptyBoard() {
        board.clear();
        Assert.assertTrue("Board should be empty after clear", board.isCellEmpty(0, 0));
    }

    @Test
    public void testClearAfterPlacements() {
        board.place(0, 0, 'X');
        board.clear();
        Assert.assertTrue("Board should be empty after clear", board.isCellEmpty(0, 0));
    }

    // Horizontal Win Test Cases
    @Test
    public void testHorizontalWinTopRow() {
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');
        Assert.assertEquals('X', board.checkWinner());

        board.clear();
        board.place(0, 0, 'O');
        board.place(0, 1, 'O');
        board.place(0, 2, 'O');
        Assert.assertEquals('O', board.checkWinner());
    }

    @Test
    public void testHorizontalWinBottomRow() {
        board.place(2, 0, 'O');
        board.place(2, 1, 'O');
        board.place(2, 2, 'O');
        Assert.assertEquals('O', board.checkWinner());

        board.clear();
        board.place(2, 0, 'X');
        board.place(2, 1, 'X');
        board.place(2, 2, 'X');
        Assert.assertEquals('X', board.checkWinner());
    }

    @Test
    public void testHorizontalWinMiddRow() {
        board.place(1, 0, 'O');
        board.place(1, 1, 'O');
        board.place(1, 2, 'O');
        Assert.assertEquals('O', board.checkWinner());

        board.clear();
        board.place(1, 0, 'X');
        board.place(1, 1, 'X');
        board.place(1, 2, 'X');
        Assert.assertEquals('X', board.checkWinner());
    }

    // Vertical Win Test Cases
    @Test
    public void testVerticalWinLeftColumn() {
        board.place(0, 0, 'X');
        board.place(1, 0, 'X');
        board.place(2, 0, 'X');
        Assert.assertEquals('X', board.checkWinner());

        board.clear();
        board.place(0, 0, 'O');
        board.place(1, 0, 'O');
        board.place(2, 0, 'O');
        Assert.assertEquals('O', board.checkWinner());
    }

    @Test
    public void testVerticalWinRightColumn() {
        board.place(0, 2, 'O');
        board.place(1, 2, 'O');
        board.place(2, 2, 'O');
        Assert.assertEquals('O', board.checkWinner());

        board.clear();
        board.place(0, 2, 'X');
        board.place(1, 2, 'X');
        board.place(2, 2, 'X');
        Assert.assertEquals('X', board.checkWinner());
    }

    @Test
    public void testVerticalWinMiddColumn() {
        board.place(0, 1, 'O');
        board.place(1, 1, 'O');
        board.place(2, 1, 'O');
        Assert.assertEquals('O', board.checkWinner());

        board.clear();
        board.place(0, 1, 'X');
        board.place(1, 1, 'X');
        board.place(2, 1, 'X');
        Assert.assertEquals('X', board.checkWinner());
    }


    // Diagonal Win Test Cases
    @Test
    public void testDiagonalWinFromTopLeft() {
        board.place(0, 0, 'X');
        board.place(1, 1, 'X');
        board.place(2, 2, 'X');
        Assert.assertEquals('X', board.checkWinner());

        board.clear();
        board.place(0, 0, 'O');
        board.place(1, 1, 'O');
        board.place(2, 2, 'O');
        Assert.assertEquals('O', board.checkWinner());
    }

    @Test
    public void testDiagonalWinFromTopRight() {
        board.place(0, 2, 'O');
        board.place(1, 1, 'O');
        board.place(2, 0, 'O');
        Assert.assertEquals('O', board.checkWinner());

        board.clear();
        board.place(0, 2, 'X');
        board.place(1, 1, 'X');
        board.place(2, 0, 'X');
        Assert.assertEquals('X', board.checkWinner());
    }
}
