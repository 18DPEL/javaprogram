//printing a array ad with there index 
import java.util.*;
class Bike
{
    Scanner sc=new Scanner(System.in);
    void compute()
    {
    int i=0;
    int ar[]=new int[4];
    System.out.println("Enter your number ");
   for(i=0;i<4;i++)
   {
    ar[i]=sc.nextInt();
   }
   for(i=0;i<4;i++)
   {
    System.out.println("your print element is"+ i +" "+ar[i]);
   }
    }
}
class Array1d
{
    public static void main (String args[])
    {
        Bike f1=new Bike();
        f1.compute();

    }
}