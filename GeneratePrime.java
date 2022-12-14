 import java.util.Scanner;
  
  class Prime
{

 void compute()
 {
     int num=50,count,i;

 while (num<=1150)
{

   count=0;
  i=2;
while(i<=num/2)
{
if (num%i==0)

     {
         count++;
         break;
     }
 i++;
}
 if (count==0)
 {
 System.out.println(  num);
   }
 num++;
    }
 }
 }
class GeneratePrime
{
   public static void main(String a[])
    {
       Prime f1=new Prime();
       f1.compute();
   }
}