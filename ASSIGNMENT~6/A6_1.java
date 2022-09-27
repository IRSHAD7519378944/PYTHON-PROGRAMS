/*import java.util.*;

interface METER
{
    int KM_TO_M=1000; 
    int M_TO_CM=100;
    int CM_TO_MM=10;
    public double kilometer_to_meter(double x);
    public double meter_to_centimeter(double x);
    public double centimeter_to_milimeter(double x);
}
class Convetor implements METER
{
       public double kilometer_to_meter(double x)
       {
           return x*KM_TO_M;
       }
     public double meter_to_centimeter(double x)
     {
         return x*M_TO_CM;
     }
    public double centimeter_to_milimeter(double x)
    {
        return x*CM_TO_MM;
    }

}*/

//2. //////////////////////////////////
/*interface Shape
{
    public double getArea(double x);
    public double getArea(double x,double y);
    public String getName();
}
class Circle implements Shape
{
    public double getArea(double x)
    {
        return 3.142875*x*x;
    }
   public double getArea(double x,double y)
   {
       
   }
    public String getName()
    {
        return "Circle";
    } 

}
class Triangle implements Shape
{
    public double getArea(double x,double y)
    {
        return x*y/2;
    }
    public double getArea(double x)
    {
        
    }
public String getName()
    {
        return "Triangle";
    }
}
class Squre implements Shape
{
    public double getArea(double x)
    {
        return x*x;
    }
        public double getArea(double x,double y)
        {
            
        }
        public String getName()
    {
        return "Squre";
    }
}
class A6_1 {
    public static void main(String[] args) {
  Shape s=new Circle();
  System.out.println("Name of Shape is : "+s.getName());
  System.out.println("Area of Shape is : "+s.getArea(1000));
}
}*/
//3. ///////////////////////
/*import java.util.Scanner;
abstract class Employee
{
    String name;
    double salary;
    double bonus;
    double commission;
    String designation;
    
   abstract public String getName();
   abstract public String getDesignation();
   abstract public double getSal();
   abstract public double getbonus();
   abstract public double getcomm();
   abstract public double totalIncome();
}

class Manager extends Employee
{
    public double getSal()
    {
        return salary;
      }
    public double getbonus()
    {
        return bonus;
    }
    public double getcomm()
    {
        return commission;
    }
    public String getName()
    {
        return "Manager";
    }
   public String getDesignation()
  {
  return "officers";
  }
  public double totalIncome()
  {
  return (salary+bonus+commission);
  }
    Manager()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Salary , Bonus and commission of Manager : ");
        salary=s.nextDouble();
        bonus=s.nextDouble();
        commission=s.nextDouble();
    }
   }
class Salesman  Employee
{
   public double getSal()
    {
        return salary;
      }
    public double getbonus()
    {
      return bonus;
    }
    public double getcomm()
    {
        return commission;
    }
    public String getName()
    {
        return "Salesman";
    }
   public String getDesignation()
  {
  return "Sales Engineer";
  }
  public double totalIncome()
  {
  return (salary+commission);
  }
    Salesman()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Salary and commission of Manager : ");
        salary=s.nextDouble();
        commission=s.nextDouble();
    }
}
class Devloper extends Employee
{
  public double getSal()
    {
        return salary;
      }
  
    public double getbonus()
    {
        return bonus;
    }
    public double getcomm()
    {
        return commission;
    }
    public String getName()
    {
       return "Devloper"; 
    }
   public String getDesignation()
  {
  return "Director";
  }
  public double totalIncome()
  {
     return (bonus+salary);
  }
    Devloper()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Salary and Bonus of Manager : ");
        salary=s.nextDouble();
        bonus=s.nextDouble();
    } 
}

class A6_1 {
    public static void main(String[] args) {
  Employee e=new Devloper();
  System.out.println("Salary of "+e.getName()+" is : "+ e.getSal());
  System.out.println("Bonus of "+e.getName()+" is : "+ e.getbonus()); 
  System.out.println("Commission of "+e.getName()+" is : "+  e.getcomm()); 
  System.out.println("Desigation of "+e.getName()+" is : "+e.getDesignation());
  System.out.println("Total income of "+e.getName()+" is : "+e.totalIncome());
    }
}*/

//4. ///////////////////////////////////
interface Apartment
{
    public double getBedroom1Area(double length,double width);
    public double getBedroom2Area(double length,double width);
    public double getBedroom3Area(double length,double width);
    public double getKitchenArea(double length,double width);
    public double getHalfArea(double length,double width);
    public double getTotalArea();
}
class OnBHK implements Apartment
{
    static double c=0;
    public double getBedroom1Area(double length,double width){ 
                c=c+length*width;
        return length*width; 
    }
    public double getBedroom2Area(double length,double width){
            c=c+length*width; 
        return length*width; 
    }
    public double getBedroom3Area(double length,double width){
              c=c+length*width; 
        return length*width;
    }
 public double getKitchenArea(double length,double width)
 {
     c=c+length*width;
     return length*width;
 }
    public double getHalfArea(double length,double width){ return length*width/2; }
    public double getTotalArea(){ return c; }
}

class TwoBHK implements Apartment
{
    static double c=0;
    public double getBedroom1Area(double length,double width){ 
                c=c+length*width;
        return length*width; 
    }
    public double getBedroom2Area(double length,double width){
            c=c+length*width; 
        return length*width; 
    }
    public double getBedroom3Area(double length,double width){
              c=c+length*width; 
        return length*width;
    }
 public double getKitchenArea(double length,double width)
 {
     c=c+length*width;
     return length*width;
 }
    public double getHalfArea(double length,double width){ return length*width/2; }
    public double getTotalArea(){ return c; }
}

class ThreeBHK implements Apartment
{
    static double c=0;
    public double getBedroom1Area(double length,double width){ 
                c=c+length*width;
        return length*width; 
    }
    public double getBedroom2Area(double length,double width){
            c=c+length*width; 
        return length*width; 
    }
    public double getBedroom3Area(double length,double width){
              c=c+length*width; 
        return length*width;
    }
 public double getKitchenArea(double length,double width)
 {
     c=c+length*width;
     return length*width;
 }
    public double getHalfArea(double length,double width){ return length*width/2; }
    public double getTotalArea(){ return c; }
}


class A6_1
{
    public static void main(String[]args)
    {
        Apartment a=new ThreeBHK();
      System.out.println("Area of badRoom1 is : "+a.getBedroom1Area(114, 1000));
      System.out.println("Area of badRoom2 is : "+a.getBedroom2Area(24.56, 100.88));
      System.out.println("Area of badRoom3 is : "+a.getBedroom3Area(14, 10));
      System.out.println("Area of Kitchen is : "+a.getKitchenArea(10,20));
      System.out.println("Half Area of OnBHK is : "+a.getHalfArea(40, 60));
      System.out.println("Total Area of TwoBHK flat is : "+a.getTotalArea());
    }
}
