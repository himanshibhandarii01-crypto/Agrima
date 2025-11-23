import java.util.Scanner;

/**
 * Write a description of class CopyOfRickshawFare here.
 *
 * @author (Himanshi)
 * @version (23/11/2025)
 */
public class CopyOfRickshawFare

{
    
        public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Distace to be Travelled in KM:");
        double d = input.nextDouble();
        
        System.out.println("Enter Time in Minutes:");
        double t = input.nextDouble();
        
        System.out.println("Is the customer a local? (yes/no)");
        String LocalInput = input.next();
        boolean L = LocalInput.equalsIgnoreCase("yes");
        
        System.out.println("Is it night travel?(yes/no)");
        String NightInput = input.next();
        boolean N = NightInput.equalsIgnoreCase("yes");
        
        //Fare rules
        double bf = 60;
        double perkm = 20;
        double perMin = 2;
        double nre = 0.30;
        double ld = 0.15;
        
        double fare = bf + (d * perkm) + (t * perMin);
        
        fare = (L) ? fare - (fare * ld) : fare;
        
        fare = (N) ? fare + (fare * nre) : fare;
        
        System.out.println("----------------------------");
        System.out.println("Final Fare: Rs. "+ fare);
        System.out.println("----------------------------");
    }
}



