import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest{

    Game game;
    Player player;
    Player player2;

    @Before
    public void before(){

        game = new Game();
        player = new Player("Nikhil");
        player2 = new Player("Hadsan");

    }

    @Test
    public void hasPlayers(){
        assertEquals(0, game.getPlayers().size());
    }

    @Test
    public void hasDeck(){
        assertEquals(52, game.getDeck().getNumberOfCards());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player);
        assertEquals(1, game.getPlayers().size());
    }

    @Test
    public void canDealCardsToPlayers(){
        game.addPlayer(player);
        game.addPlayer(player2);
        game.dealCards();
        assertEquals(1, player.getNumberOfCards());
    }


}


