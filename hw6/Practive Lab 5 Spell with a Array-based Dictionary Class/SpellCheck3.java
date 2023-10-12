import java.util.Scanner;
import java.io.*;

class Dictionary {
   private String[] array;
   
   public Dictionary(String fileName) throws FileNotFoundException {
      Scanner fileReader = new Scanner(new File(fileName));
      int arraysize = 0;
      while(fileReader.hasNext()) {
         arraysize++;
         fileReader.next();
      }
      fileReader.close();
      
      array = new String[arraysize];
      
      fileReader = new Scanner(new File(fileName));
      int index = 0;
      while(index < array.length) {
         array[index] = fileReader.next().toLowerCase();
         index++; 
      }
      fileReader.close();
      
   }
   
   public boolean found(String word) {
      for(int i = 0; i < array.length; i++) {
         if(array[i].equals(word.toLowerCase()))
            return true;
      }
      
      return false;
   }
}

public class SpellCheck3 {
   public static void main(String[] args) throws FileNotFoundException {
      Dictionary dictionary = new Dictionary("Dictionary");
      Scanner paperReader = new Scanner(new File("paper"));
      int lineNumber = 0;
      while(paperReader.hasNextLine()) {
         String line = paperReader.nextLine();
         lineNumber++;
         Scanner lineReader = new Scanner(line);
         while(lineReader.hasNext()) {
            String word = lineReader.next();
            if(!dictionary.found(word)) {
               System.out.printf("Line %4d: %s\n", lineNumber, word);
            }
         }
      }
      paperReader.close();
   }
}