import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card;

    @Before
    public void before(){
        player = new Player("Hadsan");
        deck = new Deck();
        card = new Card(Suit.SPADES, Rank.NINE);
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
        player.addCard(card);
        assertEquals(1, player.getNumberOfCards());
    }
}
