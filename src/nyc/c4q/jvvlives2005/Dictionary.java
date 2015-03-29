package nyc.c4q.jvvlives2005;

/**
 *
 *
 * The inside look of Dictionary
 *
 *
 *
 Given a dictionary, implement some basic search functions

 copy /usr/share/dict/words
 one word per line

 Create a dictionary class with a constructor that takes it a file name
 Load all words into an ArrayList

 Implement a method “search” that accepts a search term from user input and returns all “hits”,
 in other words, words that contain the search term

 Implement a method “prefixSearch” that only returns “hits” that START with the search term

 Implement a method “suffixSearch” that only returns “hits” that END with the search term

 Be sure to account for the cases where there are no hits!


 EXTRA CREDIT:
 load the dictionary from a URL instead of a local file using:
 http://www.math.sjsu.edu/~foster/dictionary.txt
 * Created by c4q-joshelynvivas on 3/28/15.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

private ArrayList<String>words;

 public Dictionary() {           //constructor
   File dictionaryFile = new File("/Users/c4q-joshelynvivas/Desktop/AccessCode/AC_03-28/resources/words");

   try {
    Scanner input = new Scanner(dictionaryFile);


   }

   catch (FileNotFoundException e) {
    e.printStackTrace();
   }


  }

}
