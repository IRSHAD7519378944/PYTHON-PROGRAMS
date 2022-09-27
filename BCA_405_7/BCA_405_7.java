package bca_405_7;
///////// SINGLE INHERITANCE    /////////
class BCA
{
    private int a=10;
    public int b=20;
}
class MCA extends BCA
{
     int x=100;
     int y=200;
     public void show(){
       System.out.println("a is not accessable");
        System.out.println("b = "+b);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
}
}
public class BCA_405_7 {
    public static void main(String[] args) {
    MCA obj=new MCA();
    obj.show();
    }
    
}
