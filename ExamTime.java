//Write a menu based program to simulate the operation of a calculate 

import java.util.*;
class Exam
{   
  Scanner sc=new Scanner (System.in);
    void compute()
    {
      

      int option;
      while(true)
      {

      
      System.out.println("-------MENU-------\n"+
                          "1.ADDITION\n"+
                          "2.SUBTRACTION\n"+
                          "3.DIVION\n"+
                          "4.GENERATE REMAINDER\n"+
                          "5.MEMORY RECALL\n"+
                          "6.MEMORY STORE\n"+
                          "7.SQUARE ROOT\n"+
                          "8.EXIT");
        System.out.println("Enter your option");                    
              option=sc.nextInt();
          switch(option)
          {
            case 1:Addition f1=new Addition();
            f1.add();
            break;
            case 2:Addition f2=new Addition();
            f2.sub();
            break;
            case 3:Addition f3=new Addition();
            f3.div();
            break;
            case 4:Addition f4=new Addition();
            f4.rem();
            break;
           case 5:Addition f6=new Addition();
             f6.recall();
            break;
            case 6:Addition f7=new Addition();
               f7.store();
               break;
            case 7:Addition f5=new Addition();
            f5.sqr();
            break;
            case 8:System.exit(0);
            break;
            default:System.out.println("invalid number!!! please try again");
                  Exam f9=new Exam();
                       f9.compute();
                       
          }
    }
  }
}

class Addition 
        {
         Scanner sc=new Scanner (System.in);
          double num1 ,num3,num2,num;
         static  double  res,sum,squr;
           int choice;
           void add()
          {
             //double sum=0.0;
            System.out.println("Enter your first number");
            num1=sc.nextDouble();
            System.out.println("Enter your second number");
            num2=sc.nextDouble();
            sum=num1+num2;
           res=sum;
            System.out.println("Addition = "+sum);
            //System.out.println("Addition = "+res);
          
            //res=sum;
            while(true)
            {

            System.out.println("Do you want to add next number");
            System.out.println("press 1:yes \n"+
                                "press 2:No\n");
            System.out.println("Enter your choice\n");
            choice=sc.nextInt();
          
              switch(choice)
              {
                case 1:System.out.println("Enter your third number\n");
                     num3=sc.nextDouble();
                     sum+=num3;
                     System.out.println("Addition = "+sum);
                     break;
                case 2:System.out.println("Addition = "+sum);
                Exam f9=new Exam();
                       f9.compute();
                       break;
                
                default:System.out.println("invalid number !! please try again");
                break;
              }
            }

          }
  
          void sub()
          {
        

             System.out.println("Enter your first number");
            num1=sc.nextDouble();
            System.out.println("Enter your second number");
            num2=sc.nextDouble();
            sum=num1-num2;
            System.out.println("subtract  = "+sum);
            res=sum;

            while(true)
            {
             System.out.println("Do you want to add next number");
            System.out.println("press 1:yes \n"+
                                "press 2:No");
            System.out.println("Enter your choice\n");
            choice=sc.nextInt();
    
              switch(choice)
              {
                case 1:{System.out.println("Enter your third number\n");
                     num3=sc.nextDouble();
                     sum-=num3;
                     System.out.println("Subtraction = "+sum);}
                     break;
                case 2:System.out.println("Subtraction= "+sum);
                  Exam f9=new Exam();
                       f9.compute();
                default:System.out.println("invalid number !! please try again");
                break;
              }
            }
          

          }
          void div()
          {
             System.out.println("Enter your first number");
            num1=sc.nextDouble();
            System.out.println("Enter your second number");
            num2=sc.nextDouble();
            sum=num1/num2;
            res=sum;
             while(true)
            {
            System.out.println("Do you want to add next number");
            System.out.println("press 1:yes \n"+
                                "press 2:No");
            System.out.println("Enter your choice\n");
            choice=sc.nextInt();
          
              switch(choice)
              {
                case 1:System.out.println("Enter your third number\n");
                     num3=sc.nextDouble();
                     sum/=num3;
                     System.out.println("Division= "+sum);
                     break;
                case 2:System.out.println("Division = "+sum);
                
                  Exam f9=new Exam();
                       f9.compute();
                default:System.out.println("invalid number !! please try again");
                break;
              }
            }

          }

          void rem()
          {
             System.out.println("Enter your first number");
            num1=sc.nextDouble();
            System.out.println("Enter your second number");
            num2=sc.nextDouble();
            sum=num1%num2; 
            while(true)
            {
            System.out.println("Do you want to add next number");
            System.out.println("press 1:yes \n"+
                                "press 2:No\n");
            System.out.println("Enter your choice\n");
            choice=sc.nextInt();
          
              switch(choice)
              {
                case 1:System.out.println("Enter your third number\n");
                     num3=sc.nextDouble();
                     sum+=num3;
                     System.out.println("REMAINDER  = "+sum);
                     break;
                case 2:System.out.println("REMAINDER  = "+sum);
                res=sum;
                  Exam f9=new Exam();
                       f9.compute();
                       break;
                default:System.out.println("invalid number !! please try again");
                break;
              }
            }
          }
              void sqr()
          {
            //double num,n;
            System.out.println("Enter your number"); 
            num=sc.nextDouble();
            squr=Math.sqrt(num);
           System.out.println("SQUARE ROOT= "+squr);

           res=squr;
          }
          void recall()
          {
        
      
          System.out.println("Recall the value is :"+res);

           }
          void store ()
          {
            System.out.println("your data is stored and data is "+res);
          }
          

}   
class ExamTime
{
    public static void main(String ar[])
    {
      Exam f9=new Exam();
      f9.compute();
      
    }
}