package week1;
import java.util.Scanner;
/**
 * Write a description of class WORKSHOP11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WORKSHOP4QUESTION11
{
    public static void main (String[] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your yearly salary(NPR): ");
        double salary= input.nextDouble();
        
        double t;
        
        if(salary <= 500000){
        t = salary * 0.01;
        }
        else if(salary <= 700000){
        t = 500000 * 0.01 + (salary - 500000) * 0.1;
        }
        else if(salary <= 1000000){
        t = 500000 * 0.01 + 200000 * 0.1 + (salary - 700000) * 0.2;
        }        
        else if(salary <= 2000000){
        t= 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + (salary - 1000000) * 0.3;
        }        
        else if(salary <= 5000000){
        t = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + 1000000 * 0.3 + (salary - 2000000) * 0.36;
        }
        else{
        t = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + 1000000 * 0.3 + 3000000 * 0.36 + (salary - 5000000) * 0.39;
        }
        System.out.println("Your tax amount is: NPR."+t);
    }
}
