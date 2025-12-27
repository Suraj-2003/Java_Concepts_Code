import java.lang.*;

class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside Base");
        this.i = 0;
        this.j = 0;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }

    public void gun()
    {
        System.out.println("Inside Base gun");
    }
}

class Derived extends Base  // In Java we use extends keyword 
{
    public int x;
    public int y;

    public Derived()
    {
        System.out.println("Inside Derived");
        this.x = 10;
        this.y = 20;
    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
    }
}

class Inheritance_1
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();
        System.out.println(dobj.i); // 0
        System.out.println(dobj.j); // 0
        System.out.println(dobj.x); // 10
        System.out.println(dobj.y); // 20

        dobj.fun();
        dobj.gun();
        dobj.sun();

    }
}