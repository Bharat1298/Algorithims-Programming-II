/**
 * Lab 6 - Interfaces
 * Practice working with polymorphism by using
 * pre-existing classes and adding new methods
 * to compare alphabetical order.
 * 
 * @author Bharat Khadka
 */
import java.util.ArrayList;

public class Billfold {
    private ArrayList<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }
    
    // Calls the compareTo method defined in the card constructor to compare the cards and determine output
    public void compareCards() {
        for (int i = 0; i < cards.size() - 1; i++) {
            Card first = cards.get(i);
            Card second = cards.get(i + 1);
            int comparison = first.compareTo(second);
            if (comparison < 0) {
                System.out.println("The name on Card " + i + " comes before the name on Card " + (i+1) + " alphabetically.");
            } else if (comparison > 0) {
                System.out.println("The name on Card " + i + " comes after the name on Card " + (i+1) + " alphabetically.");
            } else {
                System.out.println("The name on Card " + i + " is the same as the name on Card " + (i+1) + " alphabetically.");
            }
        }
    }
}