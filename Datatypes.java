import java.lang.*;
import java.util.*;
class Datatypes
{
    public static void main(String arg[])
    {
        int iNo = 10;
        char ch = 'A';
        float fNo = 10.11f;
        double dNo = 25.25;
        String str = "Hello";

        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];

        System.out.println("Value of iNo : "+iNo);
        
        System.out.println("Value of ch : "+ch);

        System.out.println("Value of fNo : "+fNo);

        System.out.println("Value of dNo : "+dNo);
        
        System.out.println("Value of str : "+str);

        System.out.println(str);
        
        
        /*
        The java.lang.IllegalArgumentException: radix:0 error means you're trying to use a java.util.Scanner to read a number with an invalid base (radix), specifically zero, which is outside the valid range (2 to 36)
        */

       System.out.println("Enter elements :");

        for(int i = 0; i < Arr.length; i++)
        {
           // Arr[i] = sobj.nextInt(Arr[0]); // java.lang.IllegalArgumentException:
            System.out.println("Enter element : "+(i+1));
            Arr[i] = sobj.nextInt(); // I written Hexadecimal 
        }
        
        System.out.println("Entered elements are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

    }
}