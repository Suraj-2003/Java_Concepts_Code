import java.lang.*;
import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}

class throw_keyword
{
    public static void main(String arg[])
    {
        // System.out.println("Jay Ganesh...!");

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sobj.nextInt();

        try
        {
            if(age < 18)
            {
                throw new AgeInvalid("Age is below 18");
            }
        }
        catch(AgeInvalid aobj)
        {
            System.out.println("Inside Catch");
            System.out.println(aobj);   
        }
    }
}