package assignment_7_2;

import java.util.InputMismatchException;
import java.util.Scanner;

class ComplexNumberFoundException extends InputMismatchException
{

    public ComplexNumberFoundException() {
     super("Sorry!! it is a Complex Number I cann't calculae square root");
    }
    
}
class NegativeNumberFoundException extends Exception
{

    public NegativeNumberFoundException() {
      super("Sorry!! it is a Negative Number I cann't calculae square root");
    }
    
}
class Findsqrt
{
    private double n;
public void getNumber()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Number : ");
    try{
     n=s.nextDouble();
   if(n<0)
        throw new NegativeNumberFoundException();
       calculate();
    }
    catch(InputMismatchException e1){
        try{
        throw new ComplexNumberFoundException();
        }
        catch(ComplexNumberFoundException e3){
                System.out.println(e3.getMessage());
                }
    }
    catch(NegativeNumberFoundException e){
        System.out.println(e.getMessage());
    }
}
public void calculate()
{
 System.out.println("Square root of "+n+" is : "+Math.sqrt(n)); 
}
}

public class ASSIGNMENT_7_2 {
    public static void main(String[] args) {
    Findsqrt  obj=new Findsqrt();
    obj.getNumber();
    }
    
}
/*   compleat */