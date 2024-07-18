import java.util.Arrays;

/**
This program demonstrates the merge sort algorithm by
sorting an array that is filled with random numbers.
*/
public class PerformanceDemo
{
   public static void main(String[] args)
   {
	   //Analysis with n = 19
      int[] a = ArrayUtil.randomIntArray(19, 100);
      System.out.println(Arrays.toString(a));
      int[] tempA = new int[19];
      MergeSort.sort(Arrays.copyOf(a, a.length), tempA, 0, a.length - 1);
      System.out.println("Number of comparisons for merge sort, n = 19: " + MergeSort.getCounter());
      InsertionSort.sort(Arrays.copyOf(a, a.length));
      System.out.println("Number of comparisons for insertion sort, n = 19: " + InsertionSort.getCounter());
      
      System.out.println();

      //Analysis with n = 100
      MergeSort.setCounter(0);
      InsertionSort.setCounter(0);
      int[] b = ArrayUtil.randomIntArray(100, 100);
      int[] tempB = new int[100];
      MergeSort.sort(Arrays.copyOf(b, b.length), tempB, 0, b.length - 1);
      System.out.println("Number of comparisons for merge sort, n = 100: " + MergeSort.getCounter());
      InsertionSort.sort(Arrays.copyOf(b, b.length));
      System.out.println("Number of comparisons for insertion sort, n = 100: " + InsertionSort.getCounter());
      
      System.out.println();
      
      //Analysis with n = 1000
      MergeSort.setCounter(0);
      InsertionSort.setCounter(0);
      int[] c = ArrayUtil.randomIntArray(1000, 1000);
      int[] tempC = new int[1000];
      MergeSort.sort(Arrays.copyOf(c, c.length), tempC, 0, c.length - 1);
      System.out.println("Number of comparisons for merge sort, n = 1000: " + MergeSort.getCounter());
      InsertionSort.sort(Arrays.copyOf(c, c.length));
      System.out.println("Number of comparisons for insertion sort, n = 1000: " + InsertionSort.getCounter());
   }
}
