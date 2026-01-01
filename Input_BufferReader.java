import java.lang.*;
import java.io.*;

class Input_BufferReader
{
    public static void main(String arg[]) throws IOException
    {
        // System.out.println("Jay Ganesh...!");
        InputStreamReader iobj = new InputStreamReader(System.in);

        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter String : ");
        String str = bobj.readLine();

        System.out.println("Enter Integer : ");
        int iNo = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Float : ");
        float fNo = Float.parseFloat(bobj.readLine());

        System.out.println("Enter double : ");
        double dNo = Double.parseDouble(bobj.readLine());

        System.out.println("Your String : "+str);
        System.out.println("Your Integer : "+iNo);
        System.out.println("Your Float : "+fNo);
        System.out.println("Your Double : "+dNo);
    }
}