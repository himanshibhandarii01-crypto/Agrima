import java.util.Scanner;
/**
 * Write a description of class evenorodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenorodd
{//QUESTION 2 (WORKSSHOP2)
    public static void main(String [] agrs)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number:");
        int num= input.nextInt();
        if (num%2==0){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd");
        
        }
    }
}