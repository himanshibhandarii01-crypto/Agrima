import java.util.Scanner;
/**
 * Write a description of class Naturalnumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Naturalnumbers
{
    public static void main (String[] agrs)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Ask for n number:");
        int n= input.nextInt();
        int sum= 0;
        for (int i=1; i<= n; i++)
        {
            sum= sum+i;
            System.out.println(sum);
        
        }
        System.out.println("Total sum:" + sum);
    }
}