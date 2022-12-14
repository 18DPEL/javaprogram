//3. Assume that the first day of the month is "sunday".write a program to accept an input between 1 and 31 .output should 
 //be the corresponding day of the week .display invaild output if input<1 or >31.
import java.util.Scanner;

class Month 
{
Scanner sc =new Scanner(System.in);
void compute()
    {
    int num ;
    System.out.println("Enter the date of the month  ");
    num=sc.nextInt();

while(num<=31)
{
    if (num==1|| num%7==1)
    {
    System.out.println("the first day of the month  is sunday");
    
     break;
    }
        if (num==2||num%7==2){
    
            System.out.println("the day of the month is monday");
        break;

        }
        if (num==3||num%7==3)
       {
        System.out.println("the day of the month   is tuesday");
         break;
        }
        if (num==4||num%7==4)
        {
        System.out.println("the day of the month is  weddnesday");
        break;
        
        }
    
        if (num==5||num%7==5)
        {
        
        System.out.println("the day of the month is thrusday ");
        break;
        
        }

    if (num==6||num%7==6)
    {
        System.out.println("the day of the month is friday");
        
        break;
    }
        if (num==7|| num%7==0)
        {
    System.out.println("the day of the month  is saturday");
        break;
        } 
}
if(num>=32)
{
System.out.println("the is invaild");
}
}}

class Firstday
{
    public static  void main(String a[])
    {
        Month f1=new Month();
        f1.compute();


    }
}