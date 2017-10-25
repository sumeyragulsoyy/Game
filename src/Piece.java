public class Piece {
    public Square location;

    String [] pieces={"Dog","Racecar","Shoe","Hat","Boot","BattleShip","Iron","Horse"};

    public  static String name;

    public Piece(Square location,int pieceNumber) {

        this.location=location;
        this.name=pieces[pieceNumber];a
    }

    public Square getLocation() {

        return location;
    }

    public void setLocation(Square location) {

        this.location=location;
    }

    public String getName() {

        return name;
    }
}
