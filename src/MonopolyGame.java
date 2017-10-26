import java.util.Scanner;


public class MonopolyGame {

        private static final int RoundsNumber = 5;
        private static final int DiceNumber = 2;

        // oyun alanı kurulumu

        private Board board = new Board();                                  // board oluştu
        private Die[] dice = new Die[DiceNumber];   // zar objeleri yaratıldı


    public MonopolyGame(int numOfPlayer) {

        Player[] players = new Player[numOfPlayer];

            for (int i = 0; i < DiceNumber; i++) {
                dice[i] = new Die();
            }

             System.out.println("Enter names of Players: ");

            for (int i = 0; i < numOfPlayer; i++) {
                Scanner names = new Scanner(System.in);
                String nameOfPlayer = names.nextLine();
                players[i] = new Player(nameOfPlayer, board, dice, new Piece(board.getStartSquare(),i));
            }
            System.out.println("\nGame Starting...\n\n");
            playGame(players);
        }

    public void playGame(Player[] players) {

        for (int i = 0; i < RoundsNumber; i++) {
            System.out.println("----Round "+i+"----\n");

            for (Player player : players) {

                System.out.println("- "+player.getName() +" is taking a turn: \n");
                System.out.println(player.getPieceName()+" is at "+player.getLocation().getIndex()+"\n");
                System.out.println("Rolling dice...");

                int rollTotal=0;

                for(int j=0;j<dice.length;j++){

                    dice[j].roll();
                    rollTotal+=dice[j].getFaceValue();
                    int diceNumber = j + 1;
                    System.out.println("Dice " + diceNumber + ": " + dice[j].getFaceValue());
                }

                Square newLocation= board.getSquare(player.getLocation(),rollTotal);
                player.getPiece().setLocation(newLocation);

                System.out.println("\n" + player.getPieceName() + "'s new location is Square" + player.getLocation().getIndex()+"\n\n\n");
            }
        }
    }

}
