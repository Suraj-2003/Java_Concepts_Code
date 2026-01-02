import java.lang.*;

class String_XX
{
    public static void main(String arg[])
    {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        if(str1 == str3) // Compares Hashcode
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are not same");
        }

        if(str1.equals(str3))   // Comapres actual Data
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are not same");
        }
    }
}