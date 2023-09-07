public class ReadinessExamPart2 {
   public static void main(String[] args) {
      int[] intArray = {1, 3, 9, 27, 81};
      double[] doubleArray = {81.0, 36.0, 64.0, 100.0};
      System.out.println(m1(intArray));
      System.out.println(m2(doubleArray));
      System.out.println(m3(doubleArray, 36.0));
   
   }
   
   //Define a method named m1 that receives an array of integers and 
   //returns the sum of all those elements in the array whose value exceeds their index and is a multiple of 9.
   public static int m1(int[] array) {
      int sum = 0;
      for(int i = 0; i < array.length; i++) {
         if(array[i] > i && array[i]%9==0)
            sum += array[i];
      }
      
      return sum;
   }
   
   //Define a method named m2 that receives an array of doubles and 
   //returns the index of the largest element in the array. Assume there is at least one element in the array and that there are no duplicates.
   public static int m2(double[] array) {
      int index = 0;
      for(int i = 0; i < array.length; i++) {
         if(array[i] > array[index])
            index = i;
      }
      
      return index;
   }
   
   //Define a method named m3 that receives an array of doubles and another double parameter (let's call it x). 
   //The method returns the number of elements whose value equals x.
   public static int m3(double[] array, double x) {
      int count = 0;
      for(int i = 0; i < array.length; i++) {
         if(array[i] == x)
            count++;
      }
      
      return count;
   }
   
}