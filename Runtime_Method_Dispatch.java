import java.lang.*;

class Base
{
    public void fun()   // Defination
    {
        System.out.println("Inside Base fun");
    }
    
    public void gun()   // Defination
    {
        System.out.println("Inside Base gun");
    }

    
    public void sun()   // Defination
    {
        System.out.println("Inside Base sun");
    }
}

class Derived extends Base
{
    public void fun()   // override
    {
        System.out.println("Inside Derived fun");   
    }

    public void run()   // Defination
    {
        System.out.println("Inside Derived run");   
    }

}

class Runtime_Method_Dispatch
{
    public static void main(String arg[])
    {
        Base bobj = new Derived();

        bobj.fun(); // Allowed
        bobj.gun(); // 
        bobj.sun();
       // bobj.run(); // Error

    }
}