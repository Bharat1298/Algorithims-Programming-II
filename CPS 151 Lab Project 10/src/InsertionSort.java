/**
 * Programing Assignment 10 - Performance Analysis
 * Practice analyzing algorithims and time
 * complexity using Big Oh notation. This program
 * initializes a counter which records the number of
 * comparisons made for the algorithim to finish.
 * 
 * @author Bharat Khadka
 */

public class InsertionSort {
	private static int counter = 0;
    public static void sort(int[] array) {
        // Starts from the second element since the first element is considered sorted.
        for (int u = 1; u < array.length; u++) {
            int key = array[u];
            int s = u - 1;

            // Move elements of array[0..u-1], that are greater than key,
            // to one position ahead of their current position
            while (s >= 0 && array[s] > key) {
            	counter++;
                array[s + 1] = array[s];
                s = s - 1;
            }
            // Place the key in its correct position
            array[s + 1] = key;
        }
    }
    public static int getCounter() {
    	return counter;
    }
    public static void setCounter(int set) {
    	counter = set;
    }
}