import java.util.*;

class Methode
{
Scanner sc=new Scanner(System.in);
    void menu()
   {     int choice;
   
      while(true)
      {
         System.out.println("......MENU......\n"+
                          "1.Convert Currency\n"+
                          "2.convert Temperature\n"+
                          "3.convert Distance\n"+
                          "4.Exit ");
        System.out.println();                  
                          
        System.out.println("Enter your choice ");                    
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:Currency cc=new Currency();
            cc.submenu();
            break;
            case 2:Temperature  tm=new Temperature();
            tm.hot();
            break;
            case 3:Distance dm=new Distance ();
            dm.road();
            break;
            case 4:System.exit(0);
            default :System.out.println("invalid input ");
           

          }
      } 
    }
        
}

// class Exit
// {
//     void exit()
//     {

//     }
// }

class Currency
{
Scanner sc=new Scanner(System.in);
    void submenu()
    {   int option1;
    while(true)
      {
        System.out.println(".......MENU.......\n"+
                         "1.convert Rs to Dollar\n"+
                         "2.convert Rs to pound\n"+
                         "3.convert Rs to Euro\n"+
                         "4.convert Rs to Dirham\n"+
                         "5.convert Rs to Mark\n"+
                         "6.convert Rs to yen\n"+
                         "7.Exit the  Main menu");
                System.out.println();                 
               System.out.println("Enter your option1 ");                  
            
               option1=sc.nextInt();
            switch(option1)
            {
                case 1:Convert f2=new Convert();
                f2.Dollar();
                break;
                case 2:Convert f3=new Convert();
                f3.pound();
                break;
                case 3:Convert f4=new Convert();
                f4.Euro();
                break;
                case 4: Convert f5=new Convert();
                f5.Dirham();
                break;
                case 5:Convert f6=new Convert();
                f6.mark();
                break;
                case 6:Convert f7=new Convert();
                f7.yen();
                break;
                case 7:System.out.println("Exit the main menu");
                Methode f1=new Methode();
                f1.menu();

                break;
                default :System.out.println(" Invalid input try again");

                break;
            }
    }
    }
}

class Convert
{
Scanner sc=new Scanner(System.in);

    void Dollar()
    {
        Double Rs,dollar=0.013,result;
        System.out.println("Enter your Rupees number: ");
        Rs=sc.nextDouble();
        result=Rs*dollar;
        System.out.println("After converter Rs to dollar: "+result);
      System.out.println();
    }

    void pound ()
    {   
        Double Rs,pound=0.010 ,result;
        System.out.println("Enter your Rupees number: ");
        Rs=sc.nextDouble();
        result=Rs*pound ;
        System.out.println("After converter Rs to pound : "+result);
      System.out.println();

    }
    void Euro()
    {
        Double Rs,Euro=0.012,result;
        System.out.println("Enter your Rupees number: ");
        Rs=sc.nextDouble();
        result=Rs*Euro;
        System.out.println("After converter Rs to Euro: "+result);
      System.out.println();

    }
    void Dirham()
    {
        Double Rs,dirham=0.048,result;
        System.out.println("Enter your Rupees number: ");
        Rs=sc.nextDouble();
        result=Rs*dirham;
        System.out.println("After converter Rs to dirham: "+result);
      System.out.println();
    }
    void mark()
    {
        Double Rs,mark=0.0234,result;
        System.out.println("Enter your Rupees number: ");
        Rs=sc.nextDouble();
        result=Rs*mark;
        System.out.println("After converter Rs to mark: "+result);
      System.out.println();
    }
    void yen()
    {
        Double Rs,yen=1.54,result;
        System.out.println("Enter your Rupees number: ");
        Rs=sc.nextDouble();
        result=Rs*yen;
        System.out.println("After converter Rs to yen: "+result);
      System.out.println();
    }
}

class Temperature 
{
Scanner sc=new Scanner(System.in);
    void hot()
    {
        int option2;
        while(true)
        {
        System.out.println(".......SUBMENU.........\n"+
                           "1.Convert Centigrade to fahrenheit\n"+
                           "2.Convert Fahrenheit to centigrade\n"+
                           "3.Exit the Main Menu");
        System.out.println("Enter your option2:...");
       System.out.println();
        option2=sc.nextInt();
        switch(option2)
        {
            case 1:Force t1=new Force();
            t1.centigrade();
            break;
            case 2:Force t2=new Force();
            t2.fahrenheit();
            break;
            case 3:System.out.println("Exit to Main Menu ");
              Methode f1=new Methode();
             f1.menu();
            break;
            default :System.out.println(" Invalid input try again");
            break;
        }
      }
    }
}



class Force
{
Scanner sc=new Scanner(System.in);
    void centigrade()
    {
        Double centi,result;
        System.out.println("Enter your centigrade value ");
        centi=sc.nextDouble();
        result=centi*(9/5)+32;
        System.out.println("the convert value of centigrade to fahrenheit is: "+result);
      System.out.println();
    }
    void fahrenheit()
    { 
        Double fahren,result;
        System.out.println("Enter your  value fahrenheit value  ");
        fahren=sc.nextDouble();
        result=(5/9)*fahren-32;
        System.out.println("the fahrenheit value of centigrade is: "+result);
      System.out.println();
    }
}
class Distance 
{
Scanner sc=new Scanner(System.in);
    void road()
     {
         int option3;
         while(true)
         {
            System.out.println(".......SUBMENU.........\n"+
                           "1.Convert yards to feet\n"+
                           "2.Convert Miles to meter\n"+
                           "3.Convert Km to Meter\n"+
                           "4.Convert Meter to Centimeter\n"+
                           "5.Exit the Main Menu");
                          System.out.println();
                         System.out.println("Enter your option3:...");
                            option3=sc.nextInt();
               switch(option3)
            {
              case 1:Trk a1=new Trk();
              a1.feet();
              break;
              case 2:Trk a2=new Trk();
              a2.meter();
              break;
              case 4:Trk a4=new Trk();
              a4.kilo();
              break;
              case 3:Trk a3=new Trk();
              a3.centimeter();
              break;
              case 5:System.out.println("Exit to Main Menu ");
              Methode f1=new Methode();
              f1.menu();
              break;
              default :System.out.println(" Invalid input try again");
             break;
            
            }
          }
     }
}
class Trk
{
Scanner sc=new Scanner(System.in);
    void feet()
    {
        Double yards,result;
        System.out.println("Enter the yards value ");
        yards=sc.nextDouble();
        result=3*yards;
        System.out.println("the converted value of yards to feets is: "+result);
      System.out.println();
    }
    void meter()
    { 
        Double miles,meter= 1609.344,result;
        System.out.println("Enter the Miles  value ");
        miles =sc.nextDouble();
        result=1609.344*miles;
        System.out.println("the converted value of miles to meters is: "+result);
      System.out.println();
    }
    void kilo()
    {
         Double kilo,meter=1000.00,result;
        System.out.println("Enter the kilometer  value ");
        kilo =sc.nextDouble();
        result=1000*kilo;
        System.out.println("the converted value of kilometer to meters is: "+result);
      System.out.println();
    }
    void centimeter()
    {
        Double meter,centimeter=100.00 ,result;
        System.out.println("Enter the Meter  value ");
        meter =sc.nextDouble();
        result=100.00*meter;
        System.out.println("the converted value of  meters to  centimeter is: "+result);
      System.out.println();
   }
}

class ChangeMethod
{
    public static void main(String args[])
    {
        Methode f1=new Methode();
        f1.menu();

    }
}