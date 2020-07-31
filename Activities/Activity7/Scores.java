/**
* Colin Wallace.
* 10/14/19
* act07 arrays
*/
public class Scores {

   private int[] numbers;

/**
*
*@param numbersIn numbers input
*/
   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   
   }
/**
*Accessor for evens.
*@return */
   public int[] findEvens() {
   
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 0) {
         
            numberEvens++;   
         }
      }
   
      int[] evens = new int[numberEvens];
   
      int count = 0;
   
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 0) {
         
            evens[count] = numbers[i];
         
            count++;
         
         }
      
      }
   
      return evens;
   
   }
/**
*Accessor for odds.
*@return */
   public int[] findOdds() {
   
      int numberOdds = 0;
   
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 != 0) {
         
            numberOdds++;
         }
      }
   
      int[] odds = new int[numberOdds];
   
      int count = 0;
   
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 != 0) {
         
            odds[count] = numbers[i];
         
            count++;
         
         }
      
      }
   
      return odds;
   
   }
/**
*Calculates average of numbers in array.
*@return */
   public double calculateAverage() {
   
      double sum = 0.0;
   
      for (int i = 0; i < numbers.length; i++) {
      
         sum += numbers[i];
      
      }
   
      return sum / numbers.length;
   
   }
/**
*Turns int array to string.
*@return */
   public String toString() {
   
      String result = "";
   
      for (int i = 0; i < numbers.length; i++) {
      
         result += numbers[i] + "\t";
      
      }
   
      return result;
   
   }
/**
*Returns values of string in reverse.
*@return */
   public String toStringInReverse() {
   
      String result = "";
   
      for (int i = numbers.length - 1; i >= 0; i--) {
      
         result += numbers[i] + "\t";
      
      }
   
      return result;
   
   }

}