import java.util.Scanner;
/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NIBFIXEDDEPOSIT
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    Boolean deposit = true;
    double FeeRate = 0.005;
    while(deposit)
    {
    
        System.out.println("Enter your Principal Amt (min. 1000): ");
        double P = input.nextDouble();
        
        if (P < 1000)
        {
        System.out.println("Invalid Amt Entered, Try Again:\n");
        continue;
        }
        
        System.out.println("Enter Annual Interest rate (8-12): ");
        double AnnualInterest = input.nextDouble();
        if(AnnualInterest < 8 || AnnualInterest > 12){
        System.out.println("Invalid Interest Value Entered, Try Again:\n");
        continue;
        }
        
        System.out.println("Enter Amt of Years(Max. 5): ");
        int year = input.nextInt();
        if(year > 5 || year < 1){
        System.out.println("Invalid Amt of Years Entered, Try Again:\n");
        continue;
        }
        
        double MonthlyInterest = (AnnualInterest / 100) / 12;
        int Months = year * 12;
        
        double A = P;
        int m = 1;
        while (m<= Months)
        {
        
            A = A * (1 + MonthlyInterest);
            m++;
            
        }
        
        double Fee = A * FeeRate;
        double FinalAmt = A - Fee;
        
        System.out.println("Fixed Deposit Details:\n");
        System.out.printf("Principal(P): Rs %.2f\n", P);
        System.out.printf("Annual Rate(R): %.2f%%\n", AnnualInterest);
        System.out.printf("Monthly Rate(M): %.6f%%\n", MonthlyInterest);
        System.out.println("Year Duration(T): \n"+year);
        System.out.println("Months (t): \n"+Months);
        System.out.printf("Maturity Amt (A): Rs%.2f\n", A);
        System.out.printf("Fee Rate(f): 0.5%%\n");
        System.out.printf("Fee Amt (F): Rs %.2f\n", Fee);
        System.out.printf("Final Amt : Rs %.2f\n", FinalAmt);
    
    System.out.println("Do You Want to Continue? (Yes/No)");
    String depositAns = input.next();
    
    deposit = depositAns.equalsIgnoreCase("Yes");
}
    
    }
}