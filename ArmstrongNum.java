import java.util.Scanner;
class Array
{
    Scanner sc=new Scanner(System.in);

    void compute()
    {
      int n,orignalnumber=0,rem=0,result=0;
      System.out.println("Enter a digit number");
      n=sc.nextInt();
      orignalnumber=n;
      while(orignalnumber!=0)
      {
          rem=orignalnumber%10;
          result+=rem*rem*rem;
          orignalnumber/=10;

      }
      if (result==n)
      {
          System.out.println("the entered number is an Armstrong number "+n);

      }

      else
      {
           System.out.println("the entered number is  not Armstrong number "+n);
      }


    }
}

class ArmstrongNum
{
    public static void main(String a[])
    {
        Array f1=new Array();
        f1.compute();
    }
}