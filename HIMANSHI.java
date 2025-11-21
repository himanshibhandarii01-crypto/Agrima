
/**
 * Write a description of class HIMANSHI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HIMANSHI
{
    int qty;
    static int rrt;
    public static void main (String[] args) {
        int age=19;
        System.out.println(age);
        System.out.println(HIMANSHI.rrt);
        
        //implict typecasting
        
        double dtr= age;
        System.out.println(dtr);
        
        //explict typecasing
        
        double db= 10.09;
        int itr= (int)db;
        System.out.println(itr);
        
        //exceptions in arithmetic
        
        byte b1= 10;
        byte b2= 11;
        
        byte sum= (byte) (b1+b2);
        
        //short, char
        
        
        
        //minimum, maximum, size, bytes
        
        System.out.println(Byte.MAX_VALUE);//MAXIMUM VALUE
        System.out.println(Byte.MIN_VALUE);//MINIMUM VALUE
        System.out.println(Byte.SIZE);//BITS
        System.out.println(Byte.BYTES);//BYTES
        
        //escape sequence
        
        System.out.println("Hello\nWorld");
        System.out.println("Hamro\nNepal");
        System.out.println("She said\"hi\" ");
        
        
        //Unicode Escape Sequence
        
        System.out.println("\u2764");
        
        
        
        
        
        
        
        
        
        
    }
}