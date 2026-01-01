import java.lang.*;
import java.util.*;

class Arithmatic 
{
    public int Division(int iNo1, int iNo2)throws ArithmaticException
    {
        return (iNo1/iNo2);
    }
}

/*
    If function creator is not handle exception in their function then they use throws keyword at the end of function prototype
*/

class throws_keyword
{
    public static void main(String arg[])
    {
        // System.out.println("Jay Ganesh...!");
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        try
        {
            int Ret = aobj.Division(iNo1,iNo2);
            System.out.println("Division is : "+Ret);
        }
        catch(ArithmaticException a)
        {
            System.out.println("Inside catch");
            System.out.print(a);
        }
    }
}
