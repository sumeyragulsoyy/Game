public class Piece {
    public Square location;
   // String [] pieces={"DOG","RaceCAR","Shoe","Hat","Boot","BattleShip","Iron","Horse"};
   public  static String  name;

    public Piece(Square location,String name) {

        this.location=location;
        this.name=name;
    }

    public Square getLocation() {

        return location;
    }

    public void setLocation(Square location) {
        this.location=location;
    }
}
