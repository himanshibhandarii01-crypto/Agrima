
/**
 * Write a description of class WEEK5WORKSHOP5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WEEK5WORKSHOP5
{
    public static  void main (String[] agrs){
        int i;
        int j;
        int k;
        for (i=1; i<=5; i++)
        {
            for( j=5; j>=i;j--)
            {System.out.print(" ");
            }
            for (k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            System.out.println( );
            }
    }
}