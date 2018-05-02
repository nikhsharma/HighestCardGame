import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest{

    Game game;

    @Before
    public void before(){

        game = new Game();

    }

    @Test
    public void hasPlayers(){
        assertEquals(0, game.getPlayers().size());
    }

    @Test
    public void hasDeck(){
        assertEquals(52, game.getDeck().getNumberOfCards());
    }
}


