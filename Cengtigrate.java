//5.modify program 3.the modified program should accept ,process and display the input /output using 
//seperate methods for accept ,process and output ,
//6.write a program with 2 classes that has the following code within the business class
// import java.util.Scanner;


// class Business 
// {
//    int inp1,res;
// void compute()

// {
//     int res=0;

//     int inp1 =10;
//  res=++inp1;

//     System.out.println("inp1="+inp1 );


// }
// }

// class ModifyClass
// {
//     public static void main (String a[])
//     {
//         Business d1=new Business();
//         d1.compute();

//     }
// }

// compile the above and observe the output.

// then change the above buisness class 
//  import java.util.Scanner;

//  class Business 
// {
//      int inp1;

//      void getdata()
//     {
//        int inp1 =10;
//        ++inp1;

//       System.out.printf("inp1="+inp1);

//      }
// }
//  class ModifyClass
//  {
//      public static void main(String a[])
//      { 
//         Business f1=new Business();
//        f1.getdata();

//     }
// }
// // compile the above and observe the output.
// // then change the above business class 

// import java.util.Scanner;

// class Business 
// {
//    int   inp1,res;

// void display()
//  {



//  int inp1 =10;

//  int res = 0;

//  res =++inp1;
//  System.out.printf("inp1 ="+res);
// }
// }

// class ModifyClass
//  {
//     public static void main(String a[])
// {
//      Business E1=new Business();
//            E1.display();

//  }
// }

// compile the above and observe the output .then cha ge the above business class 

// import java.util.Scanner;

//   class Business
//  {
 
//  int inp1,res;
//  void display ()
//  {

//      int res =0;
//      int inp1=10;

//     res = inp1++;

//      System.out.printf("inp1="+res);
//  }
//  }

//  class ModifyClass
//  {
//      public static void main(String a[])
//      {
//          Business s1=new Business();
//          s1.display();
//      }
//  }






// //7.write a program to calculate the simple interest at the end of 3 years assuming a man deposite 2000 INR in bank
// //account at a interest rate of 6% per annum for 3 years ,calculate the simple interest at the end of 3years.

//  import java.util.Scanner ;

//  class Interest
//  {
//           int deposite=2000;
//         float  rate ,year,SI;
//     void compute ()
//       {
//         Scanner sc =new Scanner (System.in);
//         System.out.println("Enter the rate of interest ");
//          rate=sc.nextFloat();
//         System.out.println("Enter the year of simple interest");
//         year=sc.nextFloat();

//          SI=deposite*rate *year/100;

//      }
//        void display()
//       {
//               System.out.println("the simple interest is  : "+SI);
//       }
// }
// class ModifyClass 
// {
//     public static void main (String a[])

//     {
//        Interest e1=new Interest();
//        e1.compute();
//        e1.display();



//     }
// }
//8.write a program that accepts an input which is the centigrate value and converts the same into fahrenheit.
import java.util.Scanner;
class Centigrate 
{
        float celsius , fehrenheit;
    void compute()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the centigrate value ");
        celsius=sc.nextFloat();

    }
    void display()
    {
    fehrenheit=((celsius*9)/5)+32;

        System.out.println("the converted value of fahrenheit is :"+ fehrenheit);

    }
}
class Cengtigrate
{
    public static void main(String  a[])
    {
        Centigrate F1=new    Centigrate();
        F1.compute();
        F1.display();
    }
}