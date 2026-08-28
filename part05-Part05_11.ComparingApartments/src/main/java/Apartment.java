
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares >= compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int totalPrice = this.princePerSquare * this.squares;
        int totalCompared = compared.princePerSquare * compared.squares;
        return Math.abs(totalCompared - totalPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int totalPrice = this.princePerSquare * this.squares;
        int totalCompared = compared.princePerSquare * compared.squares;
        if (totalPrice >= totalCompared) {
            return true;
        } else {
            return false;
        }
    }
}
