//Write a program P2 that reads integers from standard input; 
//when it encounters the value 0, it prints the number of negative values read since the previous 0. 
//Assume that the first and last values in the standard input are 0. The program terminates when there is no more data. 
//Example: if the input is "0 3 8 -4 2 7 -1 0 4 0 -2 -3 -7 0" then the output will be "2 0 3". (Note:  output format doesn't matter.)
import java.util.Scanner;
public class P2 {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      int count = 0;
      stdin.nextInt();
      while(stdin.hasNextInt()) {
         int nextNum = stdin.nextInt();
        
         if(nextNum == 0) {
            System.out.print(count + " ");
            count = 0;
         } else if(nextNum < 0) {
            count++;
         }
          
      }
      
   }

}