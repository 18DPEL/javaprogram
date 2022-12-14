// print a assending order
import java.util.*;
class Bike {
    void compute()
    {
        int i,j,size,temp;
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your number ");
        // size=sc.nextInt();
        // int ar[]=new int[size];
        int ar[]={2,3,4,5,1};
        // for(i=0;i<size;i++)
        // {
        //     ar[i]=sc.nextInt();
        // }
        // System.out.println("after taing input from user ");
        // for(i=0;i<size;i++)
        // for(i=0;i<size;i++)
        // {
        //     System.out.println(ar[i]);
        // }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(ar[j]>ar[i])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }

        System.out.println("the printing number is ");
        for(i=0;i<5;i++)
        {
            System.out.println(ar[i]);
        }
       
    }
}
class Ascending
{
    public static void main(String ar[])
    {
        Bike f1=new Bike();
        f1.compute();
    }
}