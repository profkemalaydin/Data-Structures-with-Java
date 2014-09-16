/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import datastructures.ArrayStack;
import java.util.Scanner;
/**
 *
 * @author kemal
 */
public class ReverseCharacters    
{
   /**
    * Reads a sentence and reverses the characters of each word
    * using a stack.
     * @param args
    */
   public static void main (String[] args)
   {
      ArrayStack<Character> stack = new ArrayStack<>();
      String sentence = "", word;
    
      try
      {
         Scanner in = new Scanner(System.in);
         System.out.println ("Enter a sentence: ");
         sentence = in.nextLine();

         System.out.println ("Reversing each word: ");
         Scanner sentenceScanner = new Scanner(sentence);
         while (sentenceScanner.hasNext())
         {
            word = sentenceScanner.next();
            for (int i=0; i < word.length(); i++)
               stack.push(word.charAt(i));
            while (!stack.isEmpty())
               System.out.print(stack.pop());
            System.out.print(" ");
         }
         System.out.println();
      }
      catch (Exception IOException)
	  {
	     //System.out.println("Input exception reported");
      }
   }
}
