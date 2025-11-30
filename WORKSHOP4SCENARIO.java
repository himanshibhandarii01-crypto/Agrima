import java.util.*;
import java.util.Scanner;

/**
 * Write a description of class WORKSHOP4SCENARIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WORKSHOP4SCENARIO
{
    public static void main (String[]args){
    
    Scanner input = new Scanner (System.in);
    
    double baseprice =  0;
    
    System.out.println("Enter the age");
    String age = input.next();
    
    System.out.println("Enter the movie language");
    String lan = input.next();
    
    System.out.println(" are you student? ");
    String s = input.next();
    
    System.out.println(" events ??");
    String f = input.next();
    
    switch (age){
    
    case "child":
        baseprice = 150; break;
    case "adult":
       baseprice= 250;break;
    case "senior":
        baseprice = 200;break;
        
     default:
         System.out.println("Invalid age group entered.");
     return;
    }
    
    if (lan.equalsIgnoreCase ("hindi"))
    {
        baseprice += 50;
    }
    else if (lan .equalsIgnoreCase ("english"))
    {
        baseprice += 100;
    }
    
      if (s.equalsIgnoreCase("yes")) {
            System.out.println("You are eligibe for student discounts.");
            baseprice -= baseprice*0.2; 
        } else {
            System.out.println("You are not eligibe for student discount.");
        }
    
    
    if (f.equalsIgnoreCase("yes")) {
            System.out.println("event discounts.");
            baseprice -= baseprice*0.15; 
        } else {
            System.out.println(" no event discounts.");
        }
        
     System.out.print ("the final price of ticket is  " +"RS."+ +baseprice);
    
    
    }
}



