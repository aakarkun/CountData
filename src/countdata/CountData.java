 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdata;
import java.util.Scanner;
/**
 *
 * @author Aakar
 */
public class CountData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Program that takes a sentence from user and counts no. of words and no. of characters.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        System.out.println("Your sentence: " + sentence);
        
        int wordCount = 1;
        for (int i = 0; i < sentence.length(); i++)
        {
           if(sentence.charAt(i) == ' ' && sentence.charAt(i+1)!=' ')
           {
               wordCount++;
           }
        }
        System.out.println("No. of word: " + wordCount);
        System.out.println("No. of character: " + sentence.length());
    }
    
}
