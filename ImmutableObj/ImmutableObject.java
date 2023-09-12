import java.util.Scanner;
public class ImmutableObject {
    public static void main(String[] args) {
    
      float fahrenheit, centigrade;
      fahrenheit = (float)98.6;
      centigrade = (float) ((5.0/9.0)*(fahrenheit-32));
      
      System.out.println("fahrenheit: " + fahrenheit);
      System.out.println("centigrade: " + centigrade);
      
      //for loop
      System.out.println();
      System.out.println("<<<for loop>>>");
      for(int i = 0; i <= 40; i+= 4) {
         System.out.println(i + " in centigrade is " + (float) ((5.0/9.0)*(i-32)));
      }
      
      //while loop
      System.out.println();
      System.out.println("<<<while loop>>>");
      int count = 0;
      while(count <= 40) {
         System.out.println(count + " in centigrade is " + (float) ((5.0/9.0)*(count-32)));
         count += 4;
      }
      
      System.out.println();
      Scanner stdin = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String input = stdin.next();
      
      while(!(input.equals("STOP"))) {
         if(StopChecking(input))
            System.out.println(input + " is in the 2D array!");
         else
            System.out.println(input + " is NOT in the 2D array!");
            
         System.out.print("Enter a word: ");
         input = stdin.next();
      }
      
    }
    
    public static boolean StopChecking(String targetWord) {
         String[] Cars = {"BMW", "Ferrari", "Lambo"}, Food = {"pizza", "burger", "dumpling"};
         String[][] myArray = { Cars, Food };
         
         boolean isIn = false;
         for(int r = 0; r < myArray.length; r++) {
            for(int c = 0; c < myArray[r].length; c++) {
               if(myArray[r][c].equals(targetWord))
                  isIn = true;
            }
         }
         
         return isIn;

    }
}
