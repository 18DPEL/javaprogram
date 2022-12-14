//write a program to accept 10 integer into an array .And convert all even number in the array to next highest odd number 
//,generate the sum of all the converted numbers.
import java.util.Scanner;

class Generate
{
    Scanner sc=new Scanner(System.in);

    void compute()
        {
            int ar[] =new int [10];
            int idx=0,sum=0,count=0;
            System.out.println("Enter the element of the array");
            for (idx=0;idx<10;idx++)
            {

               ar[idx]=sc.nextInt();
            }

            for(idx=0;idx<10;idx++)
            {
                if (ar[idx]%2==0)
                {
                    sum+=ar[idx];
                    ar[idx]=ar[idx]+1;

                }
            }

            for(idx=0;idx<10;idx++)
            {
                if(ar[idx%2]==1)
                {
                   count=1;

                }
            }
            for(idx=0;idx<10;idx++)
            {
                System.out.println("Element are..."+ar[idx] );

            }



            if(count==1)
            {
                System.out.println("No even number are present in the array");

            }
            else
            {
                System.out.println("the sum of all the convered even numbers into odd numbers are : "+sum);

            }

        }
    }




class EvenOddArray
{
    public static void main(String args[])
    {
      Generate f1=new Generate();
      f1.compute();
    }
}