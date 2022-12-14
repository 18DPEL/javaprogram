import java.util.*;
class Bike 
{
    Scanner sc=new Scanner(System.in);
    void compute()
    {
      
        String string[]=new String[25];

        System.out.println("Enter the of student ");
        for(int i=0;i<=2;i++)
        {
        string[i]=sc.nextLine();
        
        }
        for(int i=0;i<=2 ;i++)
        {
         System.out.println("the out put "+string[i]);

        }
    }

}
class File
{
    public static void main (String ar[])
    {
      Bike f1=new Bike();
      f1.compute();

    }
}