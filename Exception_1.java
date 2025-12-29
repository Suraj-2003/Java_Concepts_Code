import java.lang.*;
import java.util.*;
import java.lang.ArithmeticException;

class Exception_1
{
    public static void main(String arg[])
    {
        // System.out.println("Jay Ganesh...!");
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 10;
        int iNo2 = 0;
        int iRet = 0;

        int Arr[] = new int[5];
        /*
            try block is a block, it contains prone code
        */
        try
        {
            iRet = iNo1 / iNo2;
        }
        catch(ArithmeticException a)  // Specific Exception  
        {
            System.out.println(a);
        }

        System.out.println("Division is : "+iRet);

        System.out.println("Enter elements : ");
        try
        {
            for(int iCnt = 0; iCnt <= 6; iCnt++)
            {
                Arr[iCnt] = sobj.nextInt();
            }
        }
        catch(Exception e) // Generic Exception
        {
              System.out.println(e);    
        }

            System.out.println("Entered elements : ");

            for(int iCnt = 0; iCnt <= 6; iCnt++)
            {
                System.out.println(Arr[iCnt]);
            } 
    }
}