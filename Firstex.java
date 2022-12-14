import java.util.*;
class Bike 
{
    int x=40;
    public int y=90;
    protected int z=78;
   private int a=67;
    void compute()
    {
        System.out.println("the output of default x="+x);
        System.out.println("the output of public y="+y);
       System.out.println("the output of protected  z="+z);
       System.out.println("the output of private a="+a);

    }
}
class Child extends Bike
{
    // private int a=67;
    
    void compute()
    {
        super.compute();
        System.out.println("default variable"+x);
        System.out.println("the output ofprotected  z="+z);
        // System.out.println("the output of private a="+a);

         System.out.println("the output of public a="+y);

    }
}
class Firstex
{
    public static void main(String ar[])
    {
        Child f1=new Child();
        f1.compute();
    }
}