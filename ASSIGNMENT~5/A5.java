/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.*;
class Employee
{
    private int id;
    private String name;
    private int sal;
    private int commission;
    private static int c;
    Employee()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ID , NAME , SALARY , AND COMMISSION : ");
        id=s.nextInt();
        s.nextLine();
        name=s.nextLine();
        sal=s.nextInt();
        commission=s.nextInt();
        c++;
    }
    public void show()
    {
        System.out.println(" "+id+" "+name+" "+sal+" "+commission);
    }
    public static int count()
    {
        return c;
    }
    public static Employee lowest1(Employee []arr)
    {
     int min=arr[0].sal+arr[0].commission;
     Employee lowest;
     lowest=arr[0];
     for(int i=1; i<arr.length; i++)
     {
         if(min>(arr[i].sal+arr[i].commission))
         {
             min=arr[i].sal+arr[i].commission;
             lowest=arr[i];
         }
     }
     return lowest;
    }
    }
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.print("How many Employee Enter U want : ");
        Employee []arr=new Employee[s.nextInt()];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("For Employee"+(i+1));
            arr[i]=new Employee();
        }
        for(Employee e1 : arr)
        {
            e1.show();
        }
        Employee e=Employee.lowest1(arr);
        System.out.println("Lowest Paid Employee : ");
        e.show();
       System.out.println("Total Number of Employee : "+Employee.count());
    }
    
}
