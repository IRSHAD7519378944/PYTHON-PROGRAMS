package abstractclass;

abstract class Shape
{
    int l;
    int b;
    Shape(int l,int b){
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
    @Override
    public void area(){
        System.out.println("Area of Rectangle is : "+l*b);
    }
    
}
class Triangle extends Shape
{

    public Triangle(int l,int b) {
        super(l,b);
    }
    @Override
    public void area(){
        System.out.println("Area of Triangle is : "+l*b/2);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
    Shape s;
    s=new Triangle(20, 50);
    s.area();
    s=new Rectangle(12, 20);
    s.area();
    }
    
}
