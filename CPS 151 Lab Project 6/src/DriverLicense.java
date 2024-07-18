/**
 * Lab 6 - Interfaces
 * Practice working with polymorphism by using
 * pre-existing classes and adding new methods
 * to compare alphabetical order.
 * 
 * Changes: Changed expirationYear from a String to an int
 * 
 * @author Bharat Khadka
 */
public class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense(String name, int expirationYear) {
        super(name);
        this.expirationYear = expirationYear;
    }

    public String toString() {
        return super.toString() + ", Expiration Year: " + expirationYear;
    }
}