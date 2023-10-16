
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares () {
        return this.squares;
    }
    
    public int getPrice () {
        int value = this.pricePerSquare * this.squares;
        return value;
    }
    
    public boolean largerThan (Apartment compared) {
        return this.squares > compared.getSquares();
        
    }    
    
    public int priceDifference (Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            int difference = this.getPrice() - compared.getPrice();
            return difference;
        } else if (this.getPrice() < compared.getPrice()) {
            int difference = compared.getPrice() - this.getPrice();
            return difference;
        } else {
            return 0;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.getPrice() > compared.getPrice();
    }
    
    

}
