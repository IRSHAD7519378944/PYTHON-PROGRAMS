package bca_405_5;
////  CONSTRUCTOR OVERLOADING  ////////
class BcaDemo
{

    public BcaDemo() {
        System.out.println("Default constructor");
    }
    public BcaDemo(int a,int b)
    {
        System.out.println("sum of "+a+" and "+b+" is "+(a+b));
    }
    public BcaDemo(String n)
    {
        System.out.println("Name : "+n);
    }
    
}
public class BCA_405_5 {
     public static void main(String[] args) {
     BcaDemo obj1=new BcaDemo();
     BcaDemo obj2=new BcaDemo("Irshad");
     BcaDemo obj3=new BcaDemo(4,8);
    }
}
