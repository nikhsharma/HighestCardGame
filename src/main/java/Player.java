import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name){
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getNumberOfCards(){
        return cards.size();
    }

    public void addCard(Deck deck){
        Card card = deck.removeCard();
        this.cards.add(card);
    }
}
