/**
 * Lab 2 - ReindeerGames
 * Practice using Exceptions by prompting a user
 * for two reindeer names, checking they are part
 * of the traditional list of reindeer pulling
 * Santa's sleigh, and also ensuring the choices
 * are unique.
 * 
 * @author Bharat Khadka
 */


import java.util.Arrays;
import java.util.Scanner;

public class ReindeerGames {
    private static final String[] reindeers = {
        "dasher", "dancer", "prancer", "vixen", "comet", "cupid", "donner", "blitzen", "rudolph"
    };
    
    /**
    * Prints a list of valid reindeer.
    * 
    * @param none
    * @return void
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printRoster();

        try {
            System.out.print("First, I choose: ");
            String firstChoice = input.nextLine().toLowerCase();

            validateReindeerChoice(firstChoice);

            System.out.print("Second, I choose: ");
            String secondChoice = input.nextLine().toLowerCase();

            validateReindeerChoice(secondChoice);

            if (firstChoice.equals(secondChoice)) {
                throw new RuntimeException(firstChoice + " and " + secondChoice + " correspond to the same reindeer. Please try again.");
            }

            System.out.println("Congratulations, you have chosen " + capitalize(firstChoice) + " and " + capitalize(secondChoice) + ".");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }

    /**
     * Prints a list of valid reindeer.
     */
    
    private static void printRoster() {
        System.out.println("Which two of Santa's reindeer will you choose to play in the Reindeer Games?");
        for(String deer : reindeers) {
        	System.out.println(deer);
        }
    }

    /**
     * Validates if the chosen reindeer is in the roster.
     * 
     * @param choice The chosen reindeer.
     */
    
    private static void validateReindeerChoice(String choice) {
        if (!Arrays.asList(reindeers).contains(choice)) {
            throw new IllegalArgumentException(choice + " is not on the roster. Please try again.");
        }
    }

    /**
     * Capitalizes the first letter of a string.
     * 
     * @param str The string to capitalize.
     * @return The capitalized string.
     */
    
    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
