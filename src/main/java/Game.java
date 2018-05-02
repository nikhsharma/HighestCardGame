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
}
