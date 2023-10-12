import java.util.Scanner;
import java.io.*;

class Dictionary {
   private String fileName;
   
   public Dictionary(String fileName) {
      this.fileName = fileName;
   }
   
   public boolean found(String word) throws FileNotFoundException {
      Scanner fileReader = new Scanner(new File(fileName));
      while(fileReader.hasNext()) {
         String nextWord = fileReader.next().toLowerCase();
         if(nextWord.equals(word.toLowerCase())) {
            fileReader.close();
            return true;
         }
      }
      fileReader.close();
      return false;
   }
}

public class SpellCheck1 {
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