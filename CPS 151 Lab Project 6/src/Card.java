/*
 *
 * Name: Bharat Khadka
 * 
 * CPS 151
 * Algorithms & Programming II
 * 
 * Lab Project: Interfaces
 * 
 * Card.java source code file
 *
 */

public class Card implements Comparable<Card> 
{
   private String name;

   public Card() { name = ""; }

   public Card(String n) { name = n; }

   public String toString() { return "Card holder: " + name; }
   
   // Compares card to input
   @Override
   public int compareTo(Card other) {
       return this.name.compareTo(other.name);
   }
} // end class Card
