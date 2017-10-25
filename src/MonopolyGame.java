import java.util.ArrayList;
import java.util.Scanner;


public class MonopolyGame {

        private static final int RoundsNumber = 5;
        private static final int DiceNumber = 2;

        // oyun alanı kurulumu

        private Board board = new Board();                                  // board oluştu
        private Die[] dice = new Die[DiceNumber];                           // zar objeleri yaratıldı


    public MonopolyGame(int numOfPlayer) {

        ArrayList<Player> players = new ArrayList<Player>(numOfPlayer); // playerları oluşturduk
            for (int i = 0; i < DiceNumber; i++) {
                dice[i] = new Die();
            }
             System.out.println("Enter names of Players: ");
            for (int i = 0; i < numOfPlayer; i++) {
                Scanner names = new Scanner(System.in);
                String nameOfPlayer = names.nextLine();
                Player player = new Player(nameOfPlayer, board, dice, new Piece(board.getStartSquare(),i));
                players.add(player);
            }
            playGame(players);
        }

    public void playGame(ArrayList<Player> players) {
        for (int i = 0; i < RoundsNumber; i++) {
            System.out.println("---Round "+i+"---");
            for (Player player : players) {
                player.takeTurn();
            }
        }
    }

}
