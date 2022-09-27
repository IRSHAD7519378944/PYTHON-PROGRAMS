package a4_5;
import java.util.*;
public class A4_5 {
    public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
        System.out.println("Enter value of M and N");
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter "+n+" X "+m+" matrix");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(i==0 || i==(m-1) || j==0 || j==(n-1))
                    sum=sum+arr[i][j];
            }
        }
        System.out.println("sum of boundry elements is : "+sum);
    }
    
}
