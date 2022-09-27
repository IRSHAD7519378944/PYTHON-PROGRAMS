/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
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
   Rectangle(int l,int b)
   {
       super(l,b);
   } 
   public void area()
   {
       System.out.println(l*b);
   }
}
class Triangle extends Shape
{
   Triangle(int l,int b)
   {
       super(l,b);
   } 
   public void area()
   {
       System.out.println(l*b/2);
   }
}

public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s;
        s=new Triangle(140,100);
        s.area();
        s=new Rectangle(300,800);
        s.area();
    }
    
}
