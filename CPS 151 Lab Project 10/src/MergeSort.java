/**
 * Programing Assignment 10 - Performance Analysis
 * Practice analyzing algorithims and time
 * complexity using Big Oh notation. This program
 * initializes a counter which records the number of
 * comparisons made for the algorithim to finish.
 * 
 * @author Bharat Khadka
 */

public class MergeSort {
	
	private static int counter = 0;

    /**
     * Sorts the specified array of integers using the merge sort algorithm.
     */
    public static void sort(int[] a, int[] tempArray, int first, int last) {
        if (first < last) { // Base case
            int mid = (first + last) / 2; // Find the midpoint
            sort(a, tempArray, first, mid); // Recursively sort the first half
            sort(a, tempArray, mid + 1, last); // Recursively sort the second half
            merge(a, tempArray, first, mid, last); // Merge the sorted halves
        }
    }

    /**
     * Merges two sorted halves of a subarray.
     */
    public static void merge(int[] a, int[] tempArray, int first, int mid, int last) {
        int first1 = first, last1 = mid; // First half endpoints
        int first2 = mid + 1, last2 = last; // Second half endpoints
        int index = first1; // Next index open in tempArray

        // As long as neither half is complete, move the smaller element into tempArray
        while (first1 <= last1 && first2 <= last2) {
            if (a[first1] < a[first2]) {
                tempArray[index] = a[first1];
                first1++;
            } else {
                tempArray[index] = a[first2];
                first2++;
            }
            index++;
            counter++;
        }

        // Copy any remaining entries of the first half
        while (first1 <= last1) {
            tempArray[index] = a[first1];
            first1++;
            index++;
        }

        // Copy any remaining entries of the second half
        while (first2 <= last2) {
            tempArray[index] = a[first2];
            first2++;
            index++;
        }

        // Copy back from the temporary array to the original array
        for (index = first; index <= last; index++) {
            a[index] = tempArray[index];
        }
    }
    
    
    //Counter methods
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int set) {
		counter = set;
	}
}
