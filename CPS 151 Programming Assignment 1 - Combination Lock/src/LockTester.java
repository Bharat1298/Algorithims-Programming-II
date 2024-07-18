/**
 * Programing Assignment 1 - Combination Lock
 * Practice working with classes and objects by simulating
 * a Combination Lock. This portion of the assignment uses the 
 * lock template to create a Combination Lock object and prompts the user
 * to unlock the lock.
 * 
 * @author Bharat Khadka
 */

import java.util.Scanner;

public class LockTester {
    public static void main(String[] args) {
    	// User input
        Scanner input = new Scanner(System.in);
        // Combination from example
        ComboLock lock = new ComboLock(0, 0, 0);
        
        // Test the changeLock method
        lock.changeLock(10, 2, 8);

        // Allows for multiple attempts and resets the dial for every attempt 
        while (true) {
            lock.reset();

            System.out.print("Enter the 1st # of ticks (to the right): ");
            int ticksRight1 = input.nextInt();
            // Test the turnRight method
            lock.turnRight(ticksRight1);

            System.out.print("Enter the 2nd # of ticks (to the left): ");
            // Test the turnLeft method
            int ticksLeft = input.nextInt();
            lock.turnLeft(ticksLeft);

            System.out.print("Enter the 3rd # of ticks (to the right): ");
            int ticksRight2 = input.nextInt();
            lock.turnRight(ticksRight2);

            // Test the isOpen method
            if (lock.isOpen()) {
                System.out.println("Click! Lock is opened.");
                break; // Breaks loop if lock was successfully unlocked
            } else {
                System.out.println("Oops! Lock refuses to open.");
            }
        }
        input.close(); // Closes scanner
    }
}