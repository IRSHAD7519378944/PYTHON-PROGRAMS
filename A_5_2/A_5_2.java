package a_5_2;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int sal;
    private int commission;
    private static int count=0;
    public Employee() {
     Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        id=s.nextInt();
        s.nextLine();
        System.out.print("Enter NAME : ");
        name=s.nextLine();
        System.out.print("Enter SALLARY : ");
        sal=s.nextInt();
        System.out.print("Enter COMMISSION : ");
        commission=s.nextInt();
        count++;
    }
    public void show(){
        System.out.println(id+"\t"+name+"\t"+sal+"\t"+commission);
    }
    public static int counter(){
        return count;
    }
    public static Employee lowest(Employee arr[]){
        Employee temp=arr[0];
        int min=(arr[0].sal+arr[0].commission);
        for(int i=1; i<arr.length; i++){
            if((arr[i].commission+arr[i].sal)<min)
                temp=arr[i];
        }
        return temp;
    }
}

public class A_5_2 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.print("How many Employee Enter U Want : ");
        Employee []arr=new Employee[s.nextInt()];
        for(int i=0; i<arr.length; i++){
            System.out.println("For Employee"+(i+1)+" Information");
            arr[i]=new Employee();
        }
        for(Employee e : arr){
            e.show();
        }
        System.out.println("Number of Employee : "+Employee.counter());
        System.out.println("<<<<<<<<===== LOWEST PAID EMPLOYEE ====>>>>>>\n");
        Employee.lowest(arr).show();
    }
    
}
