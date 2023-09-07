//Write a program P1 that reads an integer (a header) that indicates how many double values follow. 
//The program prints the smallest of the values read. You may assume that there is at least one value.
import java.util.Scanner;
public class P1 {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      int header = stdin.nextInt();
      double smallest = stdin.nextDouble();
      
      for(int i = 0; i < header-1; i++) {
         double nextNum = stdin.nextDouble();
         if(nextNum < smallest)
            smallest = nextNum;
      }
      
      System.out.println(smallest);
   
   }

}