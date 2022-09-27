package bca_405_4;
////  CONSTRUCTOR  ///////////

import java.util.*;
class BcaDemo
{
    private int id;
    private String name;
    private double sal;
    public BcaDemo() {
    Scanner s=new Scanner(System.in);
        System.out.print("Enter id : ");
        id=s.nextInt();
        s.nextLine();
        System.out.print("Enter name : ");
        name=s.nextLine();
        System.out.print("Enter sallary : ");
        sal=s.nextDouble();
}
    public void showData()
    {
        System.out.println("\tNAME\tID\tSALLARY");
        System.out.println("\t"+name+"\t"+id+"\t"+sal);
    }
}
public class BCA_405_4 {
    public static void main(String[] args) {
    BcaDemo obj=new BcaDemo();
    obj.showData();
    }
    
}
