import java.lang.*;     // To import packages

class Demo
{
    public int i;   // Non-static Charecteristics
    public int j;   // Non-static Charecteristics
    public static int k;    // Static Charecteristics

    static  // Static Block
    {
        System.out.println("Inside Static Block");
        k = 30; // Initialization of static block
    }
    

    public Demo()   // Parameterise Constructor
    {
        this.i = 10;
        this.j = 20;
    }

    public void fun()   // Non-Static method
    {
        System.out.println("Inside fun");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.k);
    }
    
    // Static method can access only Static Charecteristics.
    public static void gun()
    {
        System.out.println("Inside gun");
        // System.out.println(this.i);
        System.out.println(k);  // 30
    }
}

class StaticDemo
{   
    // Static block gets executed immediately load the file on JVM 
   /* static  // Static Block
    {
        System.out.println("Inside Static Block");
    }
    */

    public static void main(String arg[])   // Entry point function
    {
        Demo.gun(); // Inside gun , It execute before creating object of class

        Demo dobj = new Demo(); // Object Creation 

        System.out.println(dobj.i); // 10
        System.out.println(dobj.j); // 20
        System.out.println(dobj.k); // 30

        dobj.fun(); // Inside fun

    }
}