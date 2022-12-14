//2D array printing like matrix 
import java.util.*;
class Hide
{
    Scanner sc=new Scanner(System.in);
    void compute()
    {
        Scanner sc=new Scanner(System.in);
        String ar[][]=new String[3][2]; 
        
        int i,j;

          System.out.println("enter the number\n");
          for(i=0;i<3;i++)
           {
              for(j=0;j<2;j++)
              {
                ar[i][j]=sc.nextLine();
              }
              System.out.println();

            }

            System.out.println("enter the number\n");

        for(i=0;i<3;i++)
       {
            for(j=0;j<2;j++)
           {
             System.out.print( ar[i][j]+"  ");
                  
            }
            System.out.println();
        

    }
  }
}
class Aarray
{
    public static void main(String a[])
    {
      Hide f1=new Hide();
      f1.compute();

    }
}