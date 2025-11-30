import java.util.Scanner;
/**
 * Write a description of class positivenegativezero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class positivenegativezero
{ // QUESTION 3 (WORKSHOP4)
    public static void main (String[] agrs){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number:");
        int num= input.nextInt();
        if (num>0){
            System.out.println("It is positive");
        }
        else if (num<0){
            System.out.println("It is negative");
            
        }
        else{
            System.out.println("It is zero");
        }
    }
    
}