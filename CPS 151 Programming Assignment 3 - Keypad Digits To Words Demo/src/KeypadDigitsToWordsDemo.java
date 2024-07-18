import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KeypadDigitsToWordsDemo
{
   public static void main(String[] args)
   {
      KeypadDigitsToWords dictionary = new KeypadDigitsToWords();
      dictionary.loadWords("src/sample.txt");

      Scanner in = new Scanner(System.in);
      while (true)
      {
         System.out.print("Enter an integer (0 to stop): ");
         Integer number = in.nextInt();
         if (number == 0) break;
         if (dictionary.getWords(number) == null)
         {
            System.out.println("No words in the list for that number.");
         }
         else
         {
            System.out.println("These words match that number: "
               + dictionary.getWords(number));
         }
      }
   }
}
