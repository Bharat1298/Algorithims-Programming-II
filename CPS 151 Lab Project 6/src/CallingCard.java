/**
 * Lab 6 - Interfaces
 * Practice working with polymorphism by using
 * pre-existing classes and adding new methods
 * to compare alphabetical order.
 * 
 * Changes: Changed pin from String to int
 * 
 * @author Bharat Khadka
 */

public class CallingCard extends Card {
    private String cardNumber;
    private int pin;

    public CallingCard(String name, String cardNumber, int pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String toString() {
        return super.toString() + ", Card number: " + cardNumber + ", Pin: " + pin;
    }
}