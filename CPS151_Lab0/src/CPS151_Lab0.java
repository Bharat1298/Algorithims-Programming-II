/*
 * CPS151_Lab0.java
 */

import java.util.HashMap;

/**
 * CPS 151; Algorithms & Programming II
 * 
 * Lab Project 0: Review of CPS 150 Material
 *
 * @author *** Bharat Khadka ***
 */


public class CPS151_Lab0
{
  public static void main(String[] args)
  {
    int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] b = {11, 1, 4, 9, 16, 9, 7, 4, 9};
    int[] c = {11, 11, 7, 9, 16, 4, 1, 4, 9};
    
    System.out.print("The arrays a and b ");
    
    if (!sameElements(a, b)) {
      System.out.print("do not ");
    }
    
    System.out.println("have the same elements.");
    
    System.out.print("The arrays a and c ");
    
    if (!sameElements(a, c)) {
      System.out.print("do not ");
    }
    
    System.out.println("have the same elements.");
  } // end main method
  
  public static boolean sameElements(int[] a, int[] b) {
	  // If they're different lengths they cannot have the same values
	  if (a.length != b.length) {
		  return false;
	  }
	  
	  int length = a.length;
	  
	  //Mapping each number to the amount of times it shows up
	  HashMap<Integer, Integer> aValues = new HashMap<>();
	  HashMap<Integer, Integer> bValues = new HashMap<>();
	  
	  for(int i = 0; i < length; i++) {
		  if(aValues.containsKey(a[i])){
			  int curr = aValues.get(a[i]);
			  curr += 1;
			  aValues.replace(a[i], curr);
		  }else {		  
			  aValues.put(a[i], 1);
		   }
	  }
	  
	  // probably a better way to do this without two loops for optimization
	  
	  for(int i = 0; i < length; i++) {
		  if(bValues.containsKey(b[i])){
			  int curr = bValues.get(b[i]);
			  curr += 1;
			  bValues.replace(b[i], curr);
		  }else {		  
			  bValues.put(b[i], 1);
		   }
	  }
	  
	  return aValues.equals(bValues);
  }
} // end public class CPS151_Lab0