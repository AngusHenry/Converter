/*
 * Angus Henry
 * 18/03/2019
 * This program will convert metric distances to imperial distances and vice versa
 */

package metricconveter;

import java.util.Scanner;

/**
 *
 * @author anhen3335
 */
public class MetricConveter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // declare variables
      Scanner input = new Scanner(System.in);
      int select;
      double length;
      // notifys options to the user
      System.out.println ("1: Inches to centimeters     5: Centimeters to Inches");
      System.out.println ("2: Feet to centimeters         6: Centimeters to Feet");
      System.out.println ("3: Yards to Meters                 7: Meters to Yards");
      System.out.println ("4: Miles to Kilometers        8: Meters to Kilometers");
      // user selects option
      System.out.println ("Select an option: "); 
      select= input.nextInt();
      // checks which option is selected and then runs method 
      if (select == 1){
      System.out.println ("Input length in inches:"); 
      length = input.nextDouble();
      System.out.println (length + " inches is " + ItoC(length) + " centimeters");
    }
      else if (select==2){
      System.out.println ("Input length in Feet:");
      length = input.nextDouble();
      System.out.println (length + " Feet is " + FtoC(length) + " centimeters");
      }
      else if (select==3){
      System.out.println ("Input length in Yards:");
      length = input.nextDouble();
      System.out.println (length + " Yards is " + YtoM(length) + " Meters");
      }
      else if (select==4){
       System.out.println ("Input length in Miles"); 
       length = input.nextDouble();
      System.out.println (length + " Miles is " + MtoK(length) + " kilometers");
      }
      else if (select==5){
      System.out.println ("Input length in Centimeters");  
      length = input.nextDouble();
      System.out.println (length + " centimeters is " + CtoI(length) + " inches");
      }
      else if (select==6){
       System.out.println ("Input length in Centimeters"); 
       length = input.nextDouble();
      System.out.println (length + " centimeters is " + CtoF(length) + " feet");
      }
      else if (select==7){
      System.out.println ("Input length in Meters");  
      length = input.nextDouble();
      System.out.println (length + " Meters is " + MtoY(length) + " Yards");
      }
      else if (select==8){
      System.out.println ("Input length in Meters"); 
      length = input.nextDouble();
      System.out.println (length + " meters is " + MetoK(length) + " kilometers");
      }
      else {
        // you got here, sad
          System.out.println ("You have not selected a option please restart the program and try again");
    }
    }
   /**
    * This method converts Inches to centimeters
    * @param length
    * @return answer
    */
    
    public static double ItoC (double length){
    double answer;
    answer = length*2.54;
        return answer;
    }
    
    /**
    * this method converters feet to centimeters
    * @param length
    * @return answer
    */
    public static double FtoC (double length){
    double answer;
    answer = length*30;
    return answer;
    }
    
    /**
    * this method converts yards to meters
    * @param length
    * @return answer
    */
    
    public static double YtoM (double length){
    double answer;
    answer = length*0.91;
    return answer;
    }
    
    /**
    * this method converts miles to kilometers
    * @param length
    * @return answer
    */
    
    public static double MtoK (double length){
    double answer;
    answer = length*1.6;
    return answer;
    }
    
    /**
    * this method converts centimeters to inches
    * @param length
    * @return answer
    */
    
        public static double CtoI (double length){
    double answer;
    answer = length/2.54;
        return answer;
    }
    
    /**
    * this method converts centimeters to feet
    * @param length
    * @return answer
    */
    
    public static double CtoF (double length){
    double answer;
    answer = length/30;
    return answer;
    }
    
    /**
    * this method converts meters to yards
    * @param length
    * @return answer
    */
    
    public static double MtoY (double length){
    double answer;
    answer = length/0.91;
    return answer;
    }
    
     /**
    * this method converts meters to kilometers
    * @param length
    * @return answer
    */
    
    public static double MetoK (double length){
    double answer;
    answer = length/1000;
    return answer;
    }
}