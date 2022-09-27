package bca1;
import java.util.Scanner;
public class BCA1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of a and b for ax2+bx ");
        double a=s.nextDouble();
        double b=s.nextDouble();
        System.out.println("Roots of "+a+"x2 + "+b+"x is");
        System.out.println("X1 = 0 and X2 = "+(-b/a));
    }
    
}
