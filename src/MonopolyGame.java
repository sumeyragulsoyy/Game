import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.*;

public class MonopolyGame {

        private static final int RoundsNumber = 5;
        private static final int DiceNumber = 2;
    //public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
      //  System.out.println("Enter a number: ");
        int numOfPlayer = number.nextInt(); // num=player sayısı
        // oyun alanı kurulumu

        private List<Player> players = new ArrayList<Player>(numOfPlayer); // playerları oluşturduk
        private Board board = new Board();                                  // board oluştu
        private Die[] dice = new Die[DiceNumber];                           // zar objeleri yaratıldı


    public MonopolyGame() {
            for (int i = 0; i < DiceNumber; i++) {
                dice[i] = new Die();
            }
            for (int i = 0; i < numOfPlayer; i++) {
                Player player = new Player("Player" + i, board, dice);
                players.add(player);
            }
        }

    public void playGame() {
        for (int i = 0; i < RoundsNumber; i++) {
            playRound();
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    private void playRound() {
        for (Player players : players) {
            players.takeTurn();
        }
    }

}
