package arcadeAdventures.TicTacToe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

    private TicTacToe game;

    @Before
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testIsValidMoveEmptyCell() {
        // Assuming the board is empty at the start
        Assert.assertTrue("Move should be valid on an empty cell", game.isValidMove(0, 0));
    }

    @Test
    public void testIsValidMoveOccupiedCell() {
        game.getBoard().place(0, 0, 'X');
        Assert.assertFalse("Move should be invalid on an occupied cell", game.isValidMove(0, 0));
    }

    @Test
    public void testSwitchCurrentPlayerOnce() {
        game.setCurrentPlayer(game.getPlayer1());
        game.switchCurrentPlayer();
        Assert.assertNotEquals("Current player should not be player1 after switching",
                game.getPlayer1(), game.getCurrentPlayer());
    }

    @Test
    public void testSwitchCurrentPlayerTwice() {
        game.setCurrentPlayer(game.getPlayer1());
        game.switchCurrentPlayer();
        game.switchCurrentPlayer();
        Assert.assertEquals("Current player should be player1 again after switching twice",
                game.getPlayer1(), game.getCurrentPlayer());
    }
}