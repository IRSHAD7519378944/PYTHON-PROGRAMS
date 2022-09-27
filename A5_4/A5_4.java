package a5_4;
import java.util.*;

class Employee
{
    private int id;
    private String department;
    private int sal;

    public Employee() {
    Scanner s=new Scanner(System.in);
        System.out.println("Enter ID DEPARTMENT and SALARRY ");
        id=s.nextInt();
        s.nextLine();
       department=s.nextLine();
       sal=s.nextInt();
        if(department.equals("manager")||department.equals("MANAGER"))
            sal=sal+25000;
        if(department.equals("hr")||department.equals("HR"))
            sal=sal+20000;
        if(department.equals("finance")||department.equals("FINANCE"))
            sal=sal+18000;
            }
     public void show(){
         System.out.println(" "+id+"  "+department+"  "+sal);
     }
}

public class A5_4 {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        System.out.println("How many Employee Enter U want");
        Employee []arr=new Employee[s.nextInt()];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Employee"+(i+1)+" Information");
            arr[i]=new Employee();
        }
      for(Employee e : arr){
          e.show();
      }  
      
    }
    
}
/*   complete  /*/