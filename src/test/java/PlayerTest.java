import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before(){
        player = new Player("Hadsan");
        deck = new Deck();
    }

    @Test
    public void canGetName(){
        assertEquals("Hadsan", player.getName());
    }

    @Test
    public void canGetCards(){
        assertEquals(0, player.getNumberOfCards());
    }

    @Test
    public void canAddCard(){
        player.addCard(deck);
        assertEquals(1, player.getNumberOfCards());
    }
}
