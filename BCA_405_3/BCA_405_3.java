package bca_405_3;
////  CLASS MECHANISM   ////////////
class BcaDemo
{
    private int a;
    private int b;
    public void setData(int x,int y)
    {
        a=x;
        b=y;
    }
    public void showData()
    {
        System.out.println("a = "+a+" and b = "+b);
    }
}
public class BCA_405_3 {
    public static void main(String[] args) {
     BcaDemo obj=new BcaDemo();
     obj.setData(12,16);
     obj.showData();
    }
    
}
