/*
 * Angus Henry
 * 18/03/2019
 * This program will convert metric distances to imperial distances and vice versa
 */

package metricconveter;

import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class MetricConveter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String select;
      System.out.println ("1: Inches to centimeters     5: Centimeters to Inches");
      System.out.println ("2: Feet to centimeters         6: Centimeters to Feet");
      System.out.println ("3: Yards to Meters                 7: Meters to Yards");
      System.out.println ("4: Miles to Kilometers        8: Meters to Kilometers");
      select= JOptionPane.showInputDialog("Check output window.\n" 
              + " Enter your choice: " );
      if (select.equals("1")){
      System.out.println ("x");   
    }
      else if (select.equals("2")){
      System.out.println ("x");     
      }
      else if (select.equals("3")){
      System.out.println ("x");     
      }
      else if (select.equals("4")){
       System.out.println ("x");    
      }
      else if (select.equals("5")){
      System.out.println ("x");     
      }
      else if (select.equals("6")){
       System.out.println ("x");    
      }
      else if (select.equals("7")){
      System.out.println ("x");     
      }
      else if (select.equals("8")){
      System.out.println ("x");    
      }
      else {
        System.out.println ("You have not selected a option please resatrt the program and try again");
    }
    }
    
}
