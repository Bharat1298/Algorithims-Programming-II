/*
 * Author: Bharat Khadka
 * 
 * Program: This program works with ArrayLists which store Strings and manipulates them. 
 */

import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       //a
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println("Names: " + names);
       
       //b
       System.out.println("Size: " + names.size());

       //c
       System.out.println("First name: " + names.get(0));
       System.out.println("Last name: " + names.get(names.size() - 1));

       //d
       names.set(0, "Alice B. Toklas");
       System.out.println("Updated names: " + names);

       //e
       names.add(names.indexOf("David") + 1, "Doug");
       System.out.println("Names after inserting Doug: " + names);

       
       //f
       for (String name : names) {
    	    System.out.println(name);
    	}

       //g
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println("Names: " + names);
       System.out.println("Names2: " + names2);
       
       
       //h
       names.remove(0);
       System.out.println("Names after removal: " + names);
       System.out.println("Names2: " + names2);


   }
}
