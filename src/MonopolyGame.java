import java.util.Scanner;


public class MonopolyGame {

        private static final int RoundsNumber = 5;
        private static final int DiceNumber = 2;

        // oyun alanı kurulumu

        private Board board = new Board();                                  // board oluştu
        private Die[] dice = new Die[DiceNumber];   // zar objeleri yaratıldı


    public MonopolyGame(int numOfPlayer) {

        Player[] players = new Player[numOfPlayer];
        Piece[] pieces = new Piece[numOfPlayer];

            for (int i = 0; i < DiceNumber; i++) {
                dice[i] = new Die();
            }

             System.out.println("Enter names of Players: ");

            for (int i = 0; i < numOfPlayer; i++) {
                Scanner names = new Scanner(System.in);
                String nameOfPlayer = names.nextLine();
                pieces[i] = new Piece(board.getStartSquare(),i);
                players[i] = new Player(nameOfPlayer, board, dice, pieces[i]);
                System.out.println(players[i].getPieceName());
            }
            playGame(players);
        }

    public void playGame(Player[] players) {

        for (int i = 0; i < RoundsNumber; i++) {
            System.out.println("---Round "+i+"---");

            for (Player player : players) {
                player.takeTurn();
            }
        }
    }

}
