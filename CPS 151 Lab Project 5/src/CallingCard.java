public class CallingCard extends Card {
    private String cardNumber;
    private String pin;

    public CallingCard(String name, String cardNumber, String pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String toString() {
        return super.toString() + ", Card number: " + cardNumber + ", Pin: " + pin;
    }
}