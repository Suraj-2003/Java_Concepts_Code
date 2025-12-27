import java.lang.*;

class Arithmetic
{
    public int Add(int x, int y)
    {
        return x+y;
    }
    public int Add(int x, int y, int z)
    {
        return x+y+z;
    }
    public int Add(int x, int y, int z, int a)
    {
        return x+y+z+a;
    }
}

class Overloading
{
    public static void main(String arg[])
    {
        Arithmetic dobj = new Arithmetic();
        int ret = dobj.Add(11,21);
        System.out.println("Addition is : "+ret);
        ret = dobj.Add(11,21,51);
        System.out.println("Addition is : "+ret);
        ret = dobj.Add(11,21,51,101);
        System.out.println("Addition is : "+ret);
    }
}