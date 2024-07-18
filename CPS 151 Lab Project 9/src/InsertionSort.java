/**
 * Programing Assignment 9 - Insertion Sort
 * Practice understanding and working with 
 * sorting algorithims by implementing 
 * insertion sort. Code referenced off of
 * pseudocode from lab instructions.
 * 
 * @author Bharat Khadka
 */

public class InsertionSort {
    public static void sort(int[] array) {
        // Starts from the second element since the first element is considered sorted.
        for (int u = 1; u < array.length; u++) {
            int key = array[u];
            int s = u - 1;

            // Move elements of array[0..u-1], that are greater than key,
            // to one position ahead of their current position
            while (s >= 0 && array[s] > key) {
                array[s + 1] = array[s];
                s = s - 1;
            }
            // Place the key in its correct position
            array[s + 1] = key;
        }
    }
}