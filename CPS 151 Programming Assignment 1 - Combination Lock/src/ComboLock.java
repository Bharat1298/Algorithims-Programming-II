/**
 * Programing Assignment 1 - Combination Lock
 * Practice working with classes and objects by simulating
 * a Combination Lock. This portion of the assignment sets
 * up the template for a Combination Lock that can be accessed
 * by other programs.
 * 
 * @author Bharat Khadka
 */

public class ComboLock {
	
	private int secret1, secret2, secret3, currentDial, step;
	
	// Initializes the class and all of it's instance variables
	public ComboLock(int firstNum, int secondNum, int thirdNum) {
		secret1 = firstNum;
		secret2 = secondNum;
		secret3 = thirdNum;
		reset();
	}
	
	// Sets the value for the first key of the combination
	private void setSecret1(int firstNum) {
		secret1 = firstNum;
	}
	
	// Sets the value for the second key of the combination
	private void setSecret2(int secondNum) {
		secret2 = secondNum;
	}
	
	// Sets the value for the third key of the combination
	private void setSecret3(int thirdNum) {
		secret3 = thirdNum;
	}
	
	// Resets the dial value and attempt progress
	public void reset() {
		currentDial = 0;
		step = 0;
	}
	
	
	// Simulates turning the lock to the right
	public void turnRight(int numTicks) {
		// Used to set dial position after turning lock because the modulo operator covers negative cases, which we do not want
		int stepsToMove = Math.abs(40 - numTicks);
		currentDial = (currentDial + stepsToMove) % 40;
		// progress tracker to see if turns made were valid and should be considered
        if(step == 0) {
            if (currentDial == secret1) {
                step++;
            }
        }
		else if(step == 2) {
            if(currentDial == secret3) {
                step++;
            }
        }
	}
	
	// Simulates turning the lock to the left
    public void turnLeft(int ticks) {
    	currentDial = (currentDial + ticks + 40) % 40;
        if(step == 1) {
            if (currentDial == secret2) {
                step++;
            }
        }
    }
	
    // Checks to see if lock has successfully made it to the third key
	public boolean isOpen() {
		return step == 3;
	}
	
	// Changes the passcode of the combination lock
	public void changeLock(int newFirst, int newSecond, int newThird) {
		setSecret1(newFirst);
		setSecret2(newSecond);
		setSecret3(newThird);
	}
}
