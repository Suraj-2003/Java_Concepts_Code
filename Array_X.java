import java.lang.*;
import java.util.*;

class Array_C
{
    public int Arr[];

    public Array_C(int iNo) // Parametrise Constructor
    {
        Arr = new int[iNo];
    }

    public void Getter()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter element : "+(iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    
    public void Setter()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enterd elements are");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}
class Array_X
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of elements");
        int iNo = sobj.nextInt();

        Array_C aobj = new Array_C(iNo);

        aobj.Getter();
        aobj.Setter();


    }
}