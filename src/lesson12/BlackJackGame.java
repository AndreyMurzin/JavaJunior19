package lesson12;

import java.util.ArrayList;

public class BlackJackGame {
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck = new Deck();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealOfCards() {
        for (Player player : players) {
            player.addCardToHand(deck.randomCard());
            player.addCardToHand(deck.randomCard());
        }
    }

    public void nextDealOfCards() {
        for (Player player : players) {
            if (!player.areYouDealer()) {
                player.printHand();
            }
            while (player.needsCard()) {
                player.addCardToHand(deck.randomCard());
                if (!player.areYouDealer()) {
                    player.printHand();
                }
            }
        }
    }

    public void printWinner() {
        for(Player player: players) {
            if (player.valueHand() > 21) {
                player.setInGame(false);
            }
        }

        if(countPlayersInGame() == 0) {
            System.out.println("-------Dealer Winner-------");
            return;
        }

        int valueWinner = 0;
        for (Player player: players) {
            if(valueWinner < player.valueHand() && player.isInGame()) {
                valueWinner = player.valueHand();
            }
        }

        for(Player player: players) {
            if(player.valueHand() == valueWinner) {
                System.out.println("-----------Winner----------");
                player.printHand();
            }
        }
    }

    public int countPlayersInGame() {
        int countPlayers = 0;
        for (Player player: players) {
            if (player.isInGame()) {
                countPlayers++;
            }
        }
        return countPlayers;
    }
}
