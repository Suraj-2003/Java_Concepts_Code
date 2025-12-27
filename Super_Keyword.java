import java.lang.*;

class Base
{
    public int i;
    public int j;

    public Base(int x, int y)
    {
        this.i = x;
        this.j = y;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base
{
    public int a;
    public int b;

    public Derived(int p, int q)
    {
        super(11,21);
        this.a = p;
        this.b = q;
    }

    public void gun()
    {
        System.out.println("Inside Derived gun");
        System.out.println(super.i);
        super.fun();
    }
}
// By using "super" keyword we can access charecteristics of Base Class
// By using "super" keyword we can access methods of Base class
// By using "super" keyword we can call construtor of Base class (Explicitly)
class Super_Keyword
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived(10,20);
        dobj.gun();
    }
}