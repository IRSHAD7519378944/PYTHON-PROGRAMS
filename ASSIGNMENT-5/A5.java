import java.util.*;
class Employee
{
    private int id;
    private String name;
    private int sal;
    private int commission;
    
    Employe()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ID , NAME , SALARY , AND COMMISSION : ");
        id=s.nextInt();
        s.nextLine();
        name=s.nextLine();
        sal=s.nextInt();
        commission=s.nextInt();
    }
    public void show()
    {
        System.out.println(" "+id+" "+name+" "+sal+" "+commission);
    }
    }
class A5
{
    public static void main(String[]args)
    {
        Employee e1=Employee();
        Employee e2=Employee();
        e1.Show();
        e2.show();
        
    }
}