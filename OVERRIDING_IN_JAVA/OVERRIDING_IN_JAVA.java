abstract class Shape
{
    int l;
    int b;
    abstract public void area();
}
class Rectangle extends Shape
{

    public Rectangle(int l,int b) {
      this.l=l;
      this.b=b;
    }
   
    @Override
    public void area(){
        System.out.println("Area of Rectangle is : "+l*b);
    }
}
public class OVERRIDING_IN_JAVA
{
    public static void main(String[] args) {
        System.out.println("hii");
        Shape s;
        s=new Rectangle(4,8);
        s.area();
    }
}