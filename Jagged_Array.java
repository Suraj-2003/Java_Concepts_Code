import java.lang.*;
import java.util.*;

// Jagged Array in java

class Multi_Dimentional
{
    public void Display() 
    {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);
        int Arr[][] = new int [3][];

        Arr[0] = new int[2];
        Arr[1] = new int[5];
        Arr[2] = new int[3];

        Arr[0][0] = 10; // Member by member initialisation
        Arr[0][1] = 20;
        Arr[1][0] = 30;
        Arr[1][1] = 40;
        Arr[1][2] = 50;
        Arr[1][3] = 60;
        Arr[1][4] = 70;
        Arr[2][0] = 80;
        Arr[2][1] = 90;
        Arr[2][2] = 100;

        try
        {
            Arr[2][3] = 60;
        }
        catch(ArrayIndexOutOfBoundsException a)
        {}
        // catch(Exception e)  // Here we use generic exception 
        // {
        //     System.out.println(e);
        // }
        

        for(i = 0; i <Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


class Array_MultiX
{
    public static void main(String arg[])
    {
        // System.out.println("Jay Ganesh...!");
        Multi_Dimentional mobj = new Multi_Dimentional();
        mobj.Display();

    }
}