/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.*;
public class A3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner(System.in);
       System.out.println("How many Number Ente U want");
       int []arr=new int[s.nextInt()];
       System.out.println("Enter "+arr.length+"  Numbers");
    for(int i=0; i<arr.length; i++)
    {
        arr[i]=s.nextInt();
    }
    for(int i=0; i<arr.length; i++)
    {
      if(fibonacci(arr[i])==1)
         System.out.println(" "+arr[i]);
    }
}
 public static int fibonacci(int n)
 {
     int i,a=-1,b=1,c;
     for(i=1; i<=n; i++)
     {
         c=a+b;
         if(c==n)
          break;
         a=b;
         b=c;
     }
     if(i==n)
         return 0;
     else
         return 1;
 }
}
