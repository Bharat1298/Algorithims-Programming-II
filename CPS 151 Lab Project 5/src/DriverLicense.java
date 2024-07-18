public class DriverLicense extends Card {
    private String expirationYear;

    public DriverLicense(String name, String expirationYear) {
        super(name);
        this.expirationYear = expirationYear;
    }

    public String toString() {
        return super.toString() + ", Expiration Year: " + expirationYear;
    }
}