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

    @Test
    public void clear() {
    }

    @Test
    public void print() {
    }

    @Test
    public void checkWinner() {
    }
}
