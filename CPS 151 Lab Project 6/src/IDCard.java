/**
 * Lab 6 - Interfaces
 * Practice working with polymorphism by using
 * pre-existing classes and adding new methods
 * to compare alphabetical order.
 * 
 * Changes: None
 * 
 * @author Bharat Khadka
 */

public class IDCard extends Card {
    private String idNumber;

    public IDCard(String name, String idNumber) {
        super(name);
        this.idNumber = idNumber;
    }

    public String toString() {
        return super.toString() + ", ID: " + idNumber;
    }
}