import java.lang.*;

class Demo
{
    public int i;   // Charecteristics
    public int j;

    public Demo()   // Default Constructor
    {
        this.i = 10;
        this.j = 20;
    }

    // public Demo()   // Parameterise Constructor
    // {
    //     this.i = 10;
    //     this.j = 20;
    // }

    public void fun()
    {
        System.out.println("Inside base fun");
    }
    
    public void gun()
    {
        System.out.println("Inside base gun");
    }
}

class DemoX extends Demo
{
    int x;  
    int y;

    public DemoX(int a, int b)
    {
        super();
        this.x = a;
        this.y = b;
    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
        System.out.println(this.i);
    
    }
}

class Incapsulation
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();
        System.out.println(dobj.i); // 10   
        System.out.println(dobj.j); // 20
        dobj.fun(); // Inside base fun
        dobj.gun(); // Inside base gun

        DemoX dobjx = new DemoX(11,21);
        dobjx.gun();
        dobjx.sun();
        
    }
}