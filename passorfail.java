import java.util.Scanner;

/**
 * Write a description of class Workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class passorfail
{ //QUESTION 1 (WORKSHOP4)

    public static void main (String[] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter your grade= ");
        int num= input.nextInt();
        if (num >=30)
        {
            System.out.println("It is pass.");
            
        }
        else 
        {
        System.out.println("It is fail.");
    }
    }
        
        
    

}


