//Generate the following fibonacci sequence  0,1,1,2,3,5,8,13,21
import java.util.Scanner;
 class Series
{
     Scanner sc=new Scanner(System.in);

     void loop()
     {
         int n1=0,n2=1,n3,i,number;
         System.out.println("Enter your number ");
         
         number=sc.nextInt();
System.out.println(n1);
System.out.println(n2);
 for(i=2;i<number;i++)
 {
     n3=n1+n2;
     System.out.println(n3);
     n1=n2;
    n2=n3;

 }

     }
 }

 class FibonacciSeries 
 {
     public static void main(String a[])
     {
         Series f1= new Series();
         f1.loop();

     }
 }
