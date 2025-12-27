import java.lang.*;
import java.util.Scanner;

class Input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String str = sobj.nextLine();

        System.out.println("Enter your age : ");
        int iNo = sobj.nextInt();

        System.out.println("Enter your percentage : ");
        float fNo = sobj.nextFloat();

        System.out.println("Your name is : "+str);
        System.out.println("Your age is : "+iNo);
        System.out.println("Your name is : "+fNo);
        
    }
}