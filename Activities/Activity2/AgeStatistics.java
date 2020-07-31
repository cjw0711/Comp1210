import java.util.Scanner;
 /**
*@author Colin Wallace
*Age Statistics
*/
public class AgeStatistics {
/**
* @param args
* displays someone’s name, age, and gender, along
with calculations for age in minutes and centuries 
+ well as max heart rate based on age and gender. 
*/

   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //prompt user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //prompt user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //prompt user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries."); 
      // display max heart rate
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) { // calculate female mhr
         maxHeartRate = 209 - (0.7 * ageInYears);
         System.out.println(maxHeartRate
                                                   + " beats per minute.");
      } 
      else { // calculate male mhr 
         maxHeartRate = 214 - (0.8 * ageInYears);
         System.out.println(maxHeartRate
                                                   + " beats per minute.");
      
      }
     
   }
}