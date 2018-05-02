import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest{

    Game game;
    Player player;
    Player player2;
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void before(){

        game = new Game();
        player = new Player("Nikhil");
        player2 = new Player("Hadsan");
        card1 = new Card(Suit.CLUBS, Rank.FOUR);
        card2 = new Card(Suit.SPADES, Rank.FIVE);
        card3 = new Card(Suit.SPADES, Rank.SIX);
        card4 = new Card(Suit.SPADES, Rank.TEN);

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
        assertEquals(2, player.getNumberOfCards());
        assertEquals(2, player2.getNumberOfCards());
    }

//    @Test
//    public void checkWhichCardIsHighest(){
//        player.addCard(card1);
//        player2.addCard(card2);
//        game.addPlayer(player);
//        game.addPlayer(player2);
//        assertEquals(card2, game.checkCards());
//    }

    @Test
    public void checkWhichPlayerHasWon(){
        player.addCard(card1);
        player.addCard(card3);
        player2.addCard(card2);
        player2.addCard(card4);
        game.addPlayer(player);
        game.addPlayer(player2);
        assertEquals(player2, game.checkWinner());
    }


}


