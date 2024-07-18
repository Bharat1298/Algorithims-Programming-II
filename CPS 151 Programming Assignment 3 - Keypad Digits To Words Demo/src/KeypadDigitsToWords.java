/**
 * Programming Assignment 3 - Keypad Digits To Words Demo
 * Practice using and implementing HashMaps and TreeSets by
 * simulating pre-QWERTY keyboards. This program maps each
 * letter of the alphabet with an associated digit, and uses
 * that relation to create a numeric value for each word that
 * it is given. The words are then kept in a HashMap, where the Key
 * is the numerical value, and the Value is a list of possible words
 * that can be created with the Key.
 * 
 * @author Bharat Khadka
 */

import java.util.*;
import java.io.*;

/**
   Read all words from a list of words and add them to a map
   whose keys are the phone keypad spellings of the word, and
   whose values are sets of words with the same code. For example,
   26337 is mapped to the set { "Andes", "coder", "codes", . . .}.
   Then keep prompting the user for numbers and print out all
   words in the dictionary that can be spelled with that number. In
   your solution, use a map that maps letters to digits.
*/
public class KeypadDigitsToWords
{
   private Map<Character, Integer> phoneKeys;
   private Map<Integer, TreeSet<String>> phoneWords;

   /**
      Initialize the phone keys to characters.
   */
  public KeypadDigitsToWords() {
        phoneKeys = new HashMap<>();
        phoneWords = new HashMap<>();

        char[][] keys = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
                         {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
                         {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

        for (int i = 0; i < keys.length; i++) { // Goes from 0 to 7
            for (char c : keys[i]) {
                phoneKeys.put(c, i + 2); // Maps from 2 to 9
            }
        }
    }

   /**
      Load words from a file int the phoneWords map.
      @param filename the name of the file to load.
   */
    public void loadWords(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNext()) {
                String originalWord = fileScanner.next();
                String cleanedWord = clean(originalWord);
                int code = wordToNumber(cleanedWord.toLowerCase()); // Method to create a key for each word

                if (!phoneWords.containsKey(code)) {
                    phoneWords.put(code, new TreeSet<>());
                }
                phoneWords.get(code).add(originalWord); // Maintains case sensitivity
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

   /**
      Returns the set of words that match a given number.
      @param number the number to look up.
      @return the set of words that match a given number.
   */
    public Set<String> getWords(int number) {
        return phoneWords.get(number);
    }

   /**
      Removes non-characters.
   */
   private String clean(String s)
   {
      String r = "";
      for (int i = 0; i < s.length(); i++)
      {
         char c = s.charAt(i);
         if (Character.isLetter(c))
         {
            r = r + c;
         }
      }
      return r;
   }

   /**
     * Converts a word to its numeric phone keypad code.
     * @param word the word to convert.
     * @return the numeric code as integer.
   */
    private int wordToNumber(String word) {
        int number = 0;
        for (char c : word.toCharArray()) {
        	// Orders the numeric value by shifting tens place and adding key associated with char
            number = number * 10 + phoneKeys.get(c);
        }
        return number;
    }
}
