package bca_405_9;
////  ABSTRACT CLASS  /////
abstract class Shape
{
    int l;
    int b;
   Shape(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    abstract public void area();
}
class Rectangle extends Shape
{

    public Rectangle(int l,int b) {
        super(l,b);
    }
    public void area()
    {
        System.out.println(l*b);
    }
}
class Triangle extends Shape
{

    public Triangle(int l,int b) {
        super(l,b);
    }
    public void area()
    {
        System.out.println(l*b/2);
    }
    
}
public class BCA_405_9 {
    public static void main(String[] args) {
    Shape s;
    s=new Triangle(14,10);
    s.area();
    s=new Rectangle(14,20);
    s.area();
    }
    
}
