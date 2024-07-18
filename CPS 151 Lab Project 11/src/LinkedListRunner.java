/**
 * Lab 11 - Linked Lists
 * Practice the concept of linked lists
 * by using Java's LinkedList data structure
 * to create a linked list and Java's ListIterator
 * to traverse forward and backward along a linked list. 
 * 
 * @author Bharat Khadka
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListRunner {
    public static void main(String[] args) {
    	
        // 1. Declared/creates a LinkedList<String> called animals.
        LinkedList<String> animals = new LinkedList<>();

        // 2. Add the strings to the animals list.
        animals.add("Alligator");
        animals.add("Bear");
        animals.add("Camel");
        animals.add("Dinosaur");
        animals.add("Elephant");
        animals.add("Fish");
        animals.add("Gorilla");
        animals.add("Hen");
        animals.add("Iguana");
        animals.add("Jellyfish");
        animals.add("Kangaroo");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Nightingale");
        animals.add("Otter");
        animals.add("Penguin");
        animals.add("Quail");
        animals.add("Rabbit");
        animals.add("Snake");
        animals.add("Turtle");
        animals.add("Uakari");
        animals.add("Viper");
        animals.add("Worm");
        animals.add("Xenon");
        animals.add("Yak");
        animals.add("Zebra");

        /* 
         * 3. Create a ListIterator<String> and use it to walk sequentially through the linked list
         *    using hasNext and next, printing each string that is encountered.
         */        
        ListIterator<String> iterator = animals.listIterator();
        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /* 
         * 4. Use the iterator’s hasPrevious and previous methods to walk backwards through the list.
         *	  Examine each string and remove all the strings that begin with a vowel.
         */
        System.out.println("\nRemoving animals that start with a vowel:");
        while (iterator.hasPrevious()) {
            String current = iterator.previous();
            if (current.matches("^[AaEeIiOoUu].*")) { //Quick way to identify vowels, found online
                iterator.remove();
            }
        }

        /*
         * 5. Use iterator’s hasNext and next methods to go forward again, 
         * 	  printing out each string that remains in the linked list.
         */
        System.out.println("\nForward traversal after removal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
