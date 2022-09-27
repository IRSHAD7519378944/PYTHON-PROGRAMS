package bca_405_6;
////    METHOD OVERLOADING  ////////////
class BcaDemo
{
    public void print(String s)
    {
        System.out.println(s);
    }
    public void print(int x,int y)
    {
        System.out.println(x+" "+y);
    }
    public void print(double x,double y)
    {
        System.out.println(x+" "+y);
    }
}
public class BCA_405_6 {
    public static void main(String[] args) {
        BcaDemo obj1=new BcaDemo();
        obj1.print("irshad");
        obj1.print(3,8);
        obj1.print(5.8,9.8);

    }
    
}
