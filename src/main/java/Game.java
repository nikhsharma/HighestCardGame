import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(){
        this.players = new ArrayList<>();
        this.deck = new Deck();

    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Deck getDeck(){
        return deck;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void dealCards(){
        for (Player player : players){
            Card card = this.deck.removeCard();
            player.addCard(card);
        }
    }

    public Card checkCards(){
        int highestcard = 0;
        Card winningcard = new Card(Suit.SPADES, Rank.ACE);
        for (Player player : players){
            for (Card card : player.getCards()){
                if (card.getRank().getValue() > highestcard){
                    winningcard = card;
                    highestcard = card.getRank().getValue();
                }

            }
        }
      return winningcard;
    }

    public Player checkWinner(){
        Card winningcard = checkCards();
        Player winningPlayer = null;
        for (Player player: players){
            if (player.getCards().contains(winningcard)){
                winningPlayer = player;
            }
        }
        return winningPlayer;
    }
}
