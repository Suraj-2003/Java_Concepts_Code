import java.lang.*;
/*
    In case of final method can not override final method
*/
class Base
{
    public final void fun() // final method
    {
        System.out.println("Inside Base fun");
    }

    public void gun()
    {
        System.out.println("Inside Base gun");
    }
}

class Derived extends Base
{
    /*
    public void fun()   // Can not override fun function 
    {
        System.out.println("Inside Derived fun");
    }
    */
}

class final_method
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();
        dobj.fun();
    }
}