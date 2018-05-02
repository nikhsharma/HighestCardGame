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
            Card card2 = this.deck.removeCard();
            player.addCard(card2);
        }
    }

    public Player checkWinner(){
        int highestHand = 0;
        Player winningPlayer = null;
        for (Player player : players){

            if (player.totalCardsValue() > highestHand){
                winningPlayer = player;
                highestHand = player.totalCardsValue();
            }


//            for (Card card : player.getCards()){
//                if (card.getRank().getValue() > highestcard){
//                    winningcard = card;
//                    highestcard = card.getRank().getValue();
//                }
//
//            }
        }
      return winningPlayer;
    }

//    public Player checkWinner(){
//        Card winningcard = checkCards();
//        Player winningPlayer = null;
//        for (Player player: players){
//            if (player.getCards().contains(winningcard)){
//                winningPlayer = player;
//            }
//        }
//        return winningPlayer;
//    }
}
