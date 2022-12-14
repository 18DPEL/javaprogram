import java.util.Scanner;
class Prime
{
    Scanner sc=new Scanner(System.in);

    void loop()
    {
        int num , count=0, i ;

        System.out.println(" Enter the number ");
        num=sc.nextInt();

         for(i=2;i<=num/2;i++)

         {
          if (num%i==0)
         {
              count=1;
              break;
    }
}
if (count==0)
System.out.println("interted number is prime number");

else

System.out.println("intereted number is not prime number");
    
    }
}
class PrintPrime
{
    public static void main(String a[])
    {
Prime f1=new Prime ();
f1.loop();

    }
}







