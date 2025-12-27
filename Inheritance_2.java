import java.lang.*;

class Base
{
    public int i;

    public Base()
    {
        System.out.println("Inside Base");
    }
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Inside Derived");
    }
}

class DerivedX extends Derived
{
    public DerivedX()
    {
        System.out.println("Inside DerivedX");
    }
}

class Inheritance_2
{
    public static void main(String arg[])
    {
        DerivedX dobjX = new DerivedX();
    }
}