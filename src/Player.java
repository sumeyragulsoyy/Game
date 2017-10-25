public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private Die[] dice;

    public Player(String name, Board board, Die[] dice) {
        this.setName(name);
        this.board=board;
        this.dice=dice;
        this.piece= new Piece(board.getStartSquare()); //Player a piece objesi atıyor ----ama ismi yok !!
    }

    public void takeTurn() {
        System.out.println(name +" taking a turn... ");

        int rollTotal=0;
        for(int i=0;i<dice.length;i++){
            dice[i].roll();
            rollTotal+=dice[i].getFaceValue();
        }
        Square newLocation= board.getSquare(this.piece.getLocation(),rollTotal);
        piece.setLocation(newLocation);

        System.out.println("Square"+ getLocation().getIndex());
    }

    public Square getLocation() {
        return this.piece.getLocation();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
