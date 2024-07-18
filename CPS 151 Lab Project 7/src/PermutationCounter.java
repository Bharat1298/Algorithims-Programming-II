/**
 * CPS 151 Lab Project 7
 * Practice implementing recursion through
 * factorials. This program initializes the PermutationCounter class
 * which is able to take in an integer input and give the number of
 * permutations that input has.
 * 
 * @author Bharat Khadka
 */
public class PermutationCounter {
	//Instance Variable
	private static int count = 0;
	
	//Constructor
	public PermutationCounter(int i) {
		count = factorial(i);
	}

	//Recursive method
	private int factorial(int num) {
		//Base Case
		if(num == 1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}

	//Variable getter
	public static int getCount() {
		return count;
	}
}
