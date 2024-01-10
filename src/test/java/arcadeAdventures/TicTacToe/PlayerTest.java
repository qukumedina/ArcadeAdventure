package arcadeAdventures.TicTacToe;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player playerX = new Player('X');
        Assert.assertEquals("Player should be initialized with marker X", 'X', playerX.getMarker());

        Player playerO = new Player('O');
        Assert.assertEquals("Player should be initialized with marker O", 'O', playerO.getMarker());
    }

    @Test
    public void testGetMarkerX() {
        Player playerX = new Player('X');
        Assert.assertEquals("Player should have marker X", 'X', playerX.getMarker());
    }

    @Test
    public void testGetMarkerO() {
        Player playerO = new Player('O');
        Assert.assertEquals("Player should have marker O", 'O', playerO.getMarker());
    }
}
