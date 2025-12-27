import java.lang.*;

class Base
{
    public int i;
    public final int j = 20;    // It is valid in Java but not in C++
    public final int k;

    public Base()
    {
        this.i = 10;
        this.k = 30;
    }

    public void fun()
    {
        i++;    // Allowed
     // j++;    // NA
     // k++;    // NA
    }

}

class final_Charecteristics
{
    public static void main(String arg[])
    {
        Base bobj = new Base();

        System.out.println(bobj.i); //  10
        System.out.println(bobj.j); //  20
        System.out.println(bobj.k); //  30
        bobj.fun();
        System.out.println(bobj.i); //  11
        
    }
}