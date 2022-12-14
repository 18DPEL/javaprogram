import java.util.*;
class Rome
{
    Scanner sc=new Scanner(System.in);
 
    void compute()
    {
       char ar[][]=new char[5][5];
       int i,j;
       int count=0,count1=0,count2=0,count3=0;
       System.out.println("enter the element");
       for(i=0;i<5;i++)
       {
           for( j=0;j<5;j++)
           {
               ar[i][j]=sc.next().charAt(0);

           }
            System.out.println();
 
        }
        System.out.println("after charter ....");
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length;j++)
            {
                System.out.print( ar[i][j]+"  ");
                
            }
            System.out.println();
        }
         System.out.println();
         i=0;
        for( j=0;j<ar.length;j++)
        {
            if (ar[i][j]==ar[4-i][4-j])
            {
                count++;

            }
        }
        j=0;
        for( i=0;i<ar.length;i++)
        {
             if (ar[i][j]==ar[4-i][4-j])
            {
                count1++;

            }   
        }
        i=1;
        for( j=0;j<ar.length;j++)
        {
             if (ar[i][j]==ar[4-i][4-j])
            {
                count2++;

            }
        }
        i=2;
        for(j=0;j<ar.length;j++)
        {
             if (ar[i][j]==ar[4-i][4-j])
            {
                count3++;

            }
            if (count3==2)
            {
                break;

            }
        }
        for ( j=0;j<ar.length;j++)
        {
            System.out.print("  "+"arr[" + j + "]"+" ");
        }
         System.out.println(" ");
        for( i=0;i<ar.length;i++)
        {
            System.out.print(" arr[" + i + "]" + " ");
            for( j=0;j<ar.length;j++)
            {
            
                System.out.print(ar[i][j]+"       ");

            }
            System.out.println();

        }
          if (count == 5 && count1 == 5 && count2 == 5 && count3 == 2) 
          {
            System.out.println("its an rostic ");

        }
        else 
        System.out.println("its not rostic ");
 
     }
 }
class rosticArray
{
    public static void main(String a[])
    {
        Rome f1=new Rome();
        f1.compute();

    }
}