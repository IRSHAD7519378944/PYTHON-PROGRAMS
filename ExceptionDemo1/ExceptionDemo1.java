package exceptiondemo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int x=0,y=0,z=0;
        System.out.println("Enter 2 number : ");
        try{
            x=s.nextInt();
            y=s.nextInt();
            z=x/y;
            System.out.println("x="+x+" y="+y);
        }
        catch(ArithmeticException e){
           System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
    
}
