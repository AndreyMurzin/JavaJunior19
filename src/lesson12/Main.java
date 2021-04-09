package lesson12;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        Player player1 = new Player();
        Dealer dealer = new Dealer();

        BlackJackGame game = new BlackJackGame();
        game.addPlayerToGame(player);
        game.addPlayerToGame(dealer);

        game.dealOfCards();
        game.nextDealOfCards();
        game.printWinner();

    }
}
