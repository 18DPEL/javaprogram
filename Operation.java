import java.util.*;
class Exam
{
    // int id;
    // String name;

        int x=30;
        int y=90;
        int z=x+y;
    Exam()
    {
        System.out.println("the out is "+z);

    }
    Exam(int id,String name)
    {
        System.out.println(name+" the out put  "+id);
    }
}
class Operation
{
    public static void main(String ar[])
    {
        Exam f1=new Exam(98,"ayub");
        Exam ou=new Exam();
        
    }
}
 