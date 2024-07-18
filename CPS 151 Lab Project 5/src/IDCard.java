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