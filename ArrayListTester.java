
/**
 * It ME
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTester
{
    public static void main (String [] args)
    {
        System.out.print("How many words: ");
        Scanner scan= new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);
        int numWords = scan.nextInt();
        System.out.println(numWords);
        
        //create an Arraylist of words. Only objects in ArrayLists no primitive
        //data types
        
        ArrayList<String> words = new ArrayList<String>();
        
        
        System.out.println(words.size());
        
        words.add("fun");
        words.add(0,"sleep");
        words.add(1,"work");
        
        System.out.println(words.size());
        System.out.println(words);
        
        words.remove(1);
        System.out.println(words);
    }
}
