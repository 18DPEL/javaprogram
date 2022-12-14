import java.util.Scanner;

class Even
{
Scanner sc=new Scanner(System.in);

    void compute()
    {

         int arr[]=new int [5];
        int add=0,odd=0;

     System.out.println("Enter the element : ");

       for(int i=0;i<5;i++)
        {
          arr[i]=sc.nextInt();
        }


       for(int j=0;j<5;j++)
        {

            if(arr[j]%2==0)
            {
             add+=arr[j];
             odd++;
            }


        }


        if(odd==0)
       { 
         System.out.println("Non of even number there");
    
        }

      else 
      System.out.println("the number is even "+add);

    }

    
}
    

class EvenOdd
{
  public static void main (String a[])
    {
       Even f1=new Even();
      f1.compute();
    
    }
}