public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private Die[] dice;

    public Player(String name, Board board, Die[] dice,Piece piece) {
        this.setName(name);
        this.board=board;
        this.dice=dice;
        this.piece=piece; //Player a piece objesi atıyor ----ama ismi yok !!
    }

    public void takeTurn() {
        System.out.println(name +" is taking a turn... ");
        System.out.println(piece.getName()+" is at "+piece.getLocation());

        int rollTotal=0;
        for(int i=0;i<dice.length;i++){
            dice[i].roll();
            rollTotal+=dice[i].getFaceValue();
        }
        Square newLocation= board.getSquare(this.piece.getLocation(),rollTotal);
        piece.setLocation(newLocation);

        System.out.println(name + " 's new location is "+"Square"+ getLocation().getIndex());
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

    public String getPieceName() {

        return piece.name;
    }
}
