import java.util.Scanner;
/**
 * Write a description of class Divisibleby3or5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisibleby350rnotpart2
{//QUESTION 5 (WORKSHOP 4)
    public static void main (String[] agrs){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=input.nextInt();
        if (num%3==0){
            if (num%5==0){
            System.out.println("The number is divisible by both 3 and 5");
        }
            else{
                System.out.println("The number is divisible by 3");
            }
        }
          else if (num%5==0){
                if (num%3==0){
                    System.out.println("The number is divisible by both 3 and 5");
        }
        else{
            System.out.println("The number is divisible by 5");
            }
        }
        else{
            System.out.println("The number is neither divisible by 3 0r 5");
            
        }
            
        }
     }
             