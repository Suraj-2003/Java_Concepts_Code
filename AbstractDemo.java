import java.lang.*;

abstract class Base
{
    public int i;   // Charecteristics
    public int j;

    public Base()   // Default Constructor
    {
        System.out.println("Inside Base Constructor");
        this.i = 0; 
        this.j = 0; 
    } 

    public void fun()   // Concrete
    {
        System.out.println("Inside Base fun");
    }

    public void gun()   //Concrete
    {
        System.out.println("Inside Base gun");
    }

    public abstract void sun();  // abstract

}

class Derived extends Base
{
    public int x;
    public int y;
    
    // Base bobj = new Base();  // Error: Base is abstract; cannot be instantiated

    public Derived()
    {
        System.out.println("Inside Derived Constructor");
        this.x = 0;
        this.y = 0;
    }

    public void fun()
    {
        System.out.println("Inside Derived fun");
    }

    public void gun()
    {
        System.out.println("Inside Derived gun");
    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
    }
}

class AbstractDemo
{
    public static void main(String arg[])
    {
        //Base bobj = new Base(); // We can inherite base class but we can not create object of a class

        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();
        dobj.sun();
    }
}