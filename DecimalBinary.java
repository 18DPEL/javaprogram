//write a program to find binary equivalent of a number.
import java.util.*;
class Binary
{
    Scanner sc =new Scanner(System.in);


    void compute()
    {
        int b=0 ,n,r;
        int base=1;
     System.out.println("Enter your decimal number");
     n=sc.nextInt();

        while(n>0)
       { 
         r=n%2;
         b=b+r*base; 
         n=n/2 ;
         base=base*10;

        }
         
         System.out.println("the binary number is: "+b);


      

    }
}
class DecimalBinary
{
    public static void main(String a[])
    {

        Binary f1=new Binary();
        f1.compute();
    }
}