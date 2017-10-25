public class Piece {

    public Square location;
    public String name;
    private String [] pieceNames={"Dog","Racecar","Shoe","Hat","Boot","BattleShip","Iron","Horse"};

    public Piece(Square location,int nameNumber) {

        this.location=location;
        this.name=pieceNames[nameNumber];
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
