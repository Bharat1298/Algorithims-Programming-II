import java.util.Arrays;

/**
This program demonstrates the merge sort algorithm by
sorting an array that is filled with random numbers.
*/
public class MergeSortDemo
{
   public static void main(String[] args)
   {
      int[] a = ArrayUtil.randomIntArray(19, 100);
      System.out.println(Arrays.toString(a));
      int[] tempA = new int[19];

      MergeSorter.sort(a, tempA, 0, a.length - 1);

      System.out.println(Arrays.toString(a));
   }
}
