import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        Game game;
        Scanner scan = new Scanner(System.in);


        game = new Game();

        System.out.printf("Welcome, enter player 1 name:");
        String name = scan.next();
        game.addPlayer(new Player(name));
        System.out.println("Player added");

        System.out.println("Enter player 2's name:");
        String name2 = scan.next();
        game.addPlayer(new Player(name2));
        System.out.println("Player added");

        game.dealCards();
        System.out.println("Dealing...");

        System.out.println(game.checkWinner().getName() + " Wins with " + game.checkWinner().totalCardsValue() + "!");


    }

}
